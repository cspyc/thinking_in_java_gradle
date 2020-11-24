package pyc.ch11_ch17.exercise.containners;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author pi
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> testList = Arrays.asList("1","3","5","10","22");

        Iterator<String> it = testList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
