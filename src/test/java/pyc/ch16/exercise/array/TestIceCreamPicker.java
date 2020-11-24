package pyc.ch16.exercise.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestIceCreamPicker {

    private IceCreamPicker picker;

    @Before
    public void initial() {
        picker = new IceCreamPicker();
    }

    @Test
    public void should_return_different_flavors_iceCream() {
        Assert.assertEquals(3, picker.getDifferentFlavorsIceCream(3).length);
        Assert.assertEquals(5, picker.getDifferentFlavorsIceCream(5).length);
    }

    @Test
    public void should_return_5_flavors_iceCream() {
        Assert.assertEquals(10, picker.getDifferentFlavorsIceCream(10).length);
    }

    @Test
    public void should_check_if_have_same_element_in_array() {
        String[] strings = {"1", "2", "3", "1", "2"};
        Assert.assertEquals(true, haveSameElementInArray(strings));
    }

    @Test
    public void should_return_false_if_did_not_have_same_element_in_array() {
        String[] strings = {"1", "2", "5"};
        Assert.assertEquals(false, haveSameElementInArray(strings));
    }

    public boolean haveSameElementInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (i != (strings.length - 1)) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Test
    public void should_return_different_flavors_iceCream_in_rand_pick() {
        System.out.println("-----should_return_different_flavors_iceCream_in_rand_pick-----");
        String[] flavours = picker.getDifferentFlavorsIceCream(3);
        Assert.assertEquals(false, haveSameElementInArray(flavours));
    }
}
