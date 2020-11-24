package pyc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author pi
 * @date 2020/04/15
 */
public class CalendarWeekPrinter {

    public String[] returnWeekNameArray() {
        String[] weekNames = {"日", "一", "二", "三", "四", "五", "六"};
        return weekNames;
    }

    public String returnHtmlFormatWeekNameString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<thread> \n <tr>");

        String[] weekName = returnWeekNameArray();
        List<String> weekNameList = Arrays.asList(weekName);
        weekNameList.forEach(week -> {
            stringBuffer.append("<td>");
            stringBuffer.append(week);
            stringBuffer.append("</td> \n");
        });

        stringBuffer.append("</tr> \n </thread>");

        return stringBuffer.toString();
    }

    public int calculateFirstDayInTheWeekOfTheInputDate(String inputDateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = simpleDateFormat.parse(inputDateString);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        int inputDateNum = calendar.get(Calendar.DAY_OF_MONTH);
        int inputDateWeekIndex = calendar.get(Calendar.DAY_OF_WEEK);

        int firstDateInWeek = inputDateNum - inputDateWeekIndex;

        return firstDateInWeek;
    }

    public String returnHtmlFormatDateString(int firstDateInWeek) {
        StringBuffer stringBuffer = new StringBuffer();
        int week = 7;
        stringBuffer.append("<tbody> \n <tr>");
        for (int i = 0; i < week; i++) {
            stringBuffer.append("<td>");
            stringBuffer.append(firstDateInWeek + i);
            stringBuffer.append("</td>");
        }
        stringBuffer.append("</tr></tbody>");

        return stringBuffer.toString();
    }

    public String printHtmlFormat(String inputDateString) throws ParseException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<table> \n");
        stringBuffer.append(returnWeekNameArray());

        int firstDate = calculateFirstDayInTheWeekOfTheInputDate(inputDateString);
        String dateString = returnHtmlFormatDateString(firstDate);
        stringBuffer.append(dateString);

        return stringBuffer.toString();
    }


    public int returnInputDateWeekdayIndex(String date) throws ParseException {
        Calendar calendar = getCalendar(date);
        int calendarResultIndex = calendar.get(Calendar.DAY_OF_WEEK);
        int index = (calendarResultIndex - 1);
        if (index < 0) {
            index = 0;
        }
        return index;
    }

    private Calendar getCalendar(String date) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = simpleDateFormat.parse(date);
        calendar.setTime(inputDate);
        return calendar;
    }

    public List<Integer> getDateBeforeInputDateAndInputDate(String inputDate) throws ParseException {
        List<Integer> result = new ArrayList<>();
        Calendar calendar = getCalendar(inputDate);
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int inputDateIndex = returnInputDateWeekdayIndex(inputDate);
        for (int i = inputDateIndex; i >= 0; i--) {
            result.add(date);
            date--;
        }
        return result;
    }

    public List<Integer> getDateAfterInputDate(String inputDate) throws ParseException {
        List<Integer> result = new ArrayList<>();
        Calendar calendar = getCalendar(inputDate);
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int inputDateIndex = returnInputDateWeekdayIndex(inputDate);
        for (int i = inputDateIndex + 1; i <= 6; i++) {
            date += 1;
            result.add(date);
        }
        return result;
    }

    public List<Integer> getWeekDatesList(String inputDate) throws ParseException {
        List<Integer> result = new ArrayList<>();
        List<Integer> beforeDate = getDateBeforeInputDateAndInputDate(inputDate);
        Collections.reverse(beforeDate);
        result.addAll(beforeDate);

        List<Integer> afterDate = getDateAfterInputDate(inputDate);
        result.addAll(afterDate);
        return result;
    }

    public void printDateList(String inputDate) throws ParseException {
        String[] weeks = returnWeekNameArray();
        List<Integer> dates = getWeekDatesList(inputDate);
        for (int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < dates.size(); i++) {
            System.out.print(dates.get(i).toString() + " ");
        }
    }

    public static void main(String[] args) throws ParseException {
        CalendarWeekPrinter calendarWeekPrinter = new CalendarWeekPrinter();
        calendarWeekPrinter.printDateList(args[0]);
    }

}
