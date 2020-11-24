package pyc.functionalprogram.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author pi
 * @date 2020/8/7 09:45:57
 */
public class MenuProcessorTest {

    private MenuProcessor menuProcessor;

    @Before
    public void setFixture() {
        menuProcessor = new MenuProcessor();
    }

    @Test
    public void should_return_3_dish_and_calories_more_than_300() throws Exception {
        List<String> threeHighCaloriesDishNames = menuProcessor.queryThreeHighCaloriesDishNames();
        Assert.assertEquals(3, threeHighCaloriesDishNames.size());
        Assert.assertEquals("pork", threeHighCaloriesDishNames.get(0));
    }

    @Test
    public void should_return_all_vegetarian_dishes() throws Exception {
        List<Dish> dishes = menuProcessor.queryAllVegetarianDishes();
        Assert.assertEquals(4, dishes.size());
    }

    @Test
    public void should_return_first_two_meat_dishes() throws Exception {
        List<Dish> twoMeatDishes = menuProcessor.queryFirstTwoDishes();
        Assert.assertEquals(2, twoMeatDishes.size());
        Assert.assertEquals("pork", twoMeatDishes.get(0).getName());
        Assert.assertEquals("beef", twoMeatDishes.get(twoMeatDishes.size() - 1).getName());
    }

    @Test
    public void should_return_number_of_dishes() throws Exception {
        Integer count = menuProcessor.countDishes();
        Assert.assertEquals(9, count.intValue());
    }

    @Test
    public void should_return_the_sum_of_calories() throws Exception {
        Long begin = System.currentTimeMillis();
        Integer calories = menuProcessor.countDishesCalories();
        Assert.assertEquals(4200, calories.intValue());
        Long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    @Test
    public void should_return_max_calories_dish() throws Exception {
        int maxCalories = menuProcessor.queryMaxCaloriesDish();
        Assert.assertEquals(800,maxCalories);
    }

    @Test
    public void should_return_average_calories() throws Exception {
        double aveCalories = menuProcessor.calculateAveCalories();
        Assert.assertEquals(4200.0/9.0,aveCalories,0.0000000);
    }

    @Test
    public void should_return_all_dish_name_join_together() throws Exception {
        String allDishName = menuProcessor.joiningAllDishName();
        Assert.assertEquals("p",allDishName.substring(0,1));
        Assert.assertEquals("n",allDishName.substring(allDishName.length()-1,allDishName.length()));
    }

    @Test
    public void should_return_different_collect_of_dish() throws Exception {
        Map<Dish.Type,List<Dish>> dishTypes = menuProcessor.groupAllDishByType();
        Assert.assertEquals(3,dishTypes.get(Dish.Type.MEAT).size());
    }

    @Test
    public void should_group_by_dish_type_and_calories() throws Exception {
        Map<Dish.Type,Map<CaloricLevel,List<Dish>>> dishes = menuProcessor.groupDishesByDishTypeAndCaloricLevel();
        Assert.assertEquals(3,dishes.get(Dish.Type.MEAT).size());
        Assert.assertEquals(1,dishes.get(Dish.Type.MEAT).get(CaloricLevel.DIET).size());
    }

    @Test
    public void should_partition_dishes_by_is_vegetarian() throws Exception {
        Map<Boolean,List<Dish>> partitionedMenu = menuProcessor.partitionedByIsVegetarian();
        Assert.assertEquals(5,partitionedMenu.get(false).size());
    }
}
