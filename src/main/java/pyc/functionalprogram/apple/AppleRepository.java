package pyc.functionalprogram.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author pi
 */
public class AppleRepository {
    private List<Apple> inventory;

    public AppleRepository() {
    }

    public AppleRepository(List<Apple> inventory) {
        this.inventory = inventory;
    }

    public List<Apple> getInventory() {
        return inventory;
    }

    public Integer harvestApple(Apple apple) {
        this.inventory.add(apple);
        return inventory.size();
    }

    public Integer harvestApples(List<Apple> apples) {
        this.inventory.addAll(apples);
        return inventory.size();
    }

    public List<Apple> pickUpGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("Green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterApples(Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : this.inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public String prettyPrintAppleInfo(List<Apple> inventory, AppleFormatter appleFormatter) {
        String output = "";
        for (Apple apple : inventory) {
            output = appleFormatter.acceptAttitude(apple);
            System.out.println(output);
        }
        return output;
    }
}
