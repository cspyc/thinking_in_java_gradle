package pyc.functionalprogram.menu;

/**
 * @author pi
 * @date 2020/8/7 09:36:21
 */
public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public enum Type{
        MEAT,FISH,OTHER
    }
}
