package pyc.functionalprogram.property;

import java.util.Optional;

/**
 * @author pi
 * @date 2020/8/14 14:56:04
 */
public class PropertiesProcess {
    public int readDuration(Properties properties, String a) {
        return Optional.ofNullable(properties.getProperty(a))
                .flatMap(OptionalUtility::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }
}
