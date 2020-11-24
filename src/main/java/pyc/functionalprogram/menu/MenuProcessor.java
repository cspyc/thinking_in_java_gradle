package pyc.functionalprogram.menu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author pi
 * @date 2020/8/7 09:40:50
 */
public class MenuProcessor {
    private List<Dish> menu;

    public MenuProcessor() {
        initialMenuData();
    }

    private void initialMenuData() {
        menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }

    public List<String> queryThreeHighCaloriesDishNames() {
        return menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Dish> queryAllVegetarianDishes() {
        return menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }

    public List<Dish> queryFirstTwoDishes() {
        return menu.stream()
                .filter(dish -> !dish.isVegetarian())
                .limit(2)
                .collect(Collectors.toList());
    }

    public Integer countDishes() {
        Optional<Integer> number = menu.stream()
                .map(dish -> 1)
                .reduce(Integer::sum);
        return number.get();
    }

    public Integer countDishesCalories() {
        Optional<Integer> calories =
                menu.stream()
                        .map(Dish::getCalories)
                        .reduce(Integer::sum);
        return calories.get();
    }

    public int queryMaxCaloriesDish() {
        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        return maxCalories.orElse(1);
    }

    public double calculateAveCalories() {
        return menu.stream()
                .collect(Collectors.averagingDouble(Dish::getCalories));
    }

    public String joiningAllDishName() {
        return menu.stream()
                .map(Dish::getName)
                .collect(Collectors.joining());
    }

    public Map<Dish.Type, List<Dish>> groupAllDishByType() {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType));
    }

    public Map<Dish.Type, Map<CaloricLevel, List<Dish>>> groupDishesByDishTypeAndCaloricLevel() {
        return menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })));
    }

    public Map<Boolean, List<Dish>> partitionedByIsVegetarian() {
        return menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
    }
}
