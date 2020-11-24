package pyc.ch11_ch17.exercise.containners;

import org.junit.Assert;
import org.junit.Test;

public class TestAddingGroups {
    @Test
    public void should_return_5_size_collection(){
        AddingGroups addingGroups = new AddingGroups();
        Assert.assertEquals(5,addingGroups.addElementsByWayOne().size());
    }

    @Test
    public void should_return_8_size_collection(){
        AddingGroups addingGroups = new AddingGroups();
        Assert.assertEquals(8,addingGroups.addElementsByWayTwo().size());
    }
    @Test
    public void should_return_6_size_collection(){
        AddingGroups addingGroups = new AddingGroups();
        Assert.assertEquals(6,addingGroups.addElementsByWayThree().size());

    }
    @Test
    public void should_change_the_first_element_to_8(){
        AddingGroups addingGroups = new AddingGroups();
        Assert.assertEquals(8,addingGroups.listSet().get(0));
    }

}
