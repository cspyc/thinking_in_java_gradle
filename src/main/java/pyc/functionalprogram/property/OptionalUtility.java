package pyc.functionalprogram.property;

import java.util.Optional;

/**
 * @author pi
 * @date 2020/8/14 15:28:41
 */
public class OptionalUtility {
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        }catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
