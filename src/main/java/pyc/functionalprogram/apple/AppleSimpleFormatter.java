package pyc.functionalprogram.apple;

/**
 * @author pi
 * @date 2020/8/5 15:41:17
 */
public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String acceptAttitude(Apple apple) {
        return "An apple of " + apple.getWeight() + " g";
    }
}
