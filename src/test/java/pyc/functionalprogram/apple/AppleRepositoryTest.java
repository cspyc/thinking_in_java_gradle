package pyc.functionalprogram.apple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppleRepositoryTest {

    private static AppleRepository appleRepository;

    @BeforeClass
    public static void setUp() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Green", 110.0));
        apples.add(new Apple("Green", 310.21));
        apples.add(new Apple("Red", 150.23));
        apples.add(new Apple("Pink", 50.23));


         appleRepository = new AppleRepository(apples);
    }

    @Test
    public void should_pick_all_green_apple() throws Exception {

        List<Apple> greenApples = appleRepository.pickUpGreenApples(appleRepository.getInventory());
        Assert.assertEquals(2, greenApples.size());
    }

    @Test
    public void should_filter_apples_though_many_condition() throws Exception {
        List<Apple> greenApples = appleRepository.filterApples((Apple a) -> a.identityAppleColor("Green"));
        Assert.assertEquals(2, greenApples.size());

        List<Apple> heavyApples = appleRepository.filterApples((Apple a) -> a.isHeavierThan(100.0));
        Assert.assertEquals(3, heavyApples.size());
    }

    @Test
    public void should_output_apple_info() throws Exception {
        String output = appleRepository.prettyPrintAppleInfo(appleRepository.getInventory(),new AppleFancyFormatter());
        Assert.assertEquals("A light Pink apple",output);

        String simpleOutput = appleRepository.prettyPrintAppleInfo(appleRepository.getInventory(),new AppleSimpleFormatter());
        Assert.assertEquals("An apple of 50.23 g",simpleOutput);
    }
}
