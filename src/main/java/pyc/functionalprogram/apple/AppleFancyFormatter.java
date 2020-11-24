package pyc.functionalprogram.apple;

/**
 * @author pi
 * @date 2020/8/5 15:40:50
 */
public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String acceptAttitude(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";

        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
