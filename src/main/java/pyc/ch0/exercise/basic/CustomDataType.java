package pyc.ch0.exercise.basic;

/**
 * @author pi
 * @date 20/11/24 14:47:55
 */
public class CustomDataType {
    public int convertBasicDoubleToBasicInt(double v) {
        return (int) Math.round(v);
    }

    public double floatPlusInt(int i, double v) {
        return i + v;
    }

    public int plusEqual(int i, double v) {
        System.out.println("outPut result:" + (i += v));
        return i += v;
    }

    public String extractSubString(String originString, int extractCharSize) {
        return originString.substring(0, extractCharSize);
    }

    public String joinStringBySign(String sign, String... subString) {
        return String.join(sign, subString);
    }
}
