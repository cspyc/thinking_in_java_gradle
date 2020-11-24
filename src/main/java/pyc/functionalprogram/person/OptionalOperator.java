package pyc.functionalprogram.person;

import java.util.Optional;

/**
 * @author pi
 * @date 2020/8/13 20:42:39
 */
public class OptionalOperator {
    Optional<Car> optCar = Optional.empty();

    public String getCarInsuranceName(Optional<Person> person){
        return person.flatMap(Person::getCarAsOptional)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
    public Optional<Integer> stringToInt(String s) {
        try{
            return Optional.of(Integer.parseInt(s));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }
}
