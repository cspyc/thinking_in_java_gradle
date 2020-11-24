package pyc.ch11_ch17.exercise.containners;

import org.junit.Assert;
import org.junit.Test;

public class TestGerbil {
    @Test
    public void should_return_a_list(){
        GerbilList gerbilList = new GerbilList();
        Assert.assertEquals(2,gerbilList.getGerbilList().size());
    }

}
