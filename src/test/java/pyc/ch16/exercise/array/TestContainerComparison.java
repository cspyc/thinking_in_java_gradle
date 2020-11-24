package pyc.ch16.exercise.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pyc
 */
public class TestContainerComparison {
    public static ContainerComparison containerComparison = null;

    @Before
    public void initial_obj() {
        containerComparison = new ContainerComparison();
    }

    @Test
    public void should_return_4_when_get_fourth_element() {
        Assert.assertEquals(4, containerComparison.queryArrayElement(4).getId());
    }

    @Test
    public void should_return_object_contain_a_value_equals_4_when_get_forth_element_in_list(){
        Assert.assertEquals(4,containerComparison.queryListElement(4).getId());
    }

    @Test
    public void should_return_a_int_when_get_a_element_from_a_array(){
        //given
        //when
        //then
        Assert.assertEquals(4,containerComparison.queryElementFromIntArray(4));
    }

    @Test
    public void should_return_a_interger_when_get_a_element_from_a_list(){
        Assert.assertEquals(4,containerComparison.queryElementFromIntegerList(4).intValue());
        Assert.assertEquals(0,containerComparison.queryElementFromIntegerList(0).intValue());
        Assert.assertEquals(97,containerComparison.queryElementFromIntegerList(6).intValue());
    }

    @Test
    public void should_return_a_array_initialed_by_one_method(){
        //given
        ArrayRobot arrayRobot = new ArrayRobotTom();
        Assert.assertEquals(5,arrayRobot.produceArray().length);
        Assert.assertEquals(null,arrayRobot.produceArray()[0]);
    }

    @Test
    public void should_produce_a_array_initialed_by_second_robot(){
        ArrayRobot arrayRobot = new ArrayRobotKitty();
        System.out.println(arrayRobot.produceArray()[1].getClass().getSimpleName());
        Assert.assertEquals("BerylliumSphere",arrayRobot.produceArray()[1].getClass().getSimpleName());

    }

    @Test
    public void should_produce_a_array_initialed_by_third_robt_through_dynamic_aggregate(){
        ArrayRobot arrayRobot = new ArrayRobotDynamicAggregate();
        Assert.assertEquals(2,arrayRobot.produceArray().length);
    }

    @Test
    public void produce_a_array_by_aggregate_initialization(){
        ArrayRobot arrayRobot = new ArrayRobotAggregate();
        Assert.assertEquals(3,arrayRobot.produceArray().length);
    }

    @Test
    public void should_initialized_with_0_when_create_a_int_array_by_default(){
        ArrayRobotInitializedZero arrayRobot = new ArrayRobotInitializedZero();
        Assert.assertEquals(0,arrayRobot.produceArray("int")[0]);

    }
}
