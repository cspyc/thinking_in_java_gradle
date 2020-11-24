package pyc.functionalprogram.person;

import java.util.Optional;

/**
 * @author pi
 * @date 2020/8/13 20:16:20
 */
public class Person {
    private Car car;

    public Optional<Car> getCarAsOptional() {
        return Optional.ofNullable(car);
    }
}
