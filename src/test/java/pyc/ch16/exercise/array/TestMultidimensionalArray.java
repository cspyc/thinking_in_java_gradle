package pyc.ch16.exercise.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMultidimensionalArray {

    private MultidimensionalArray multidimensionalArray;

    @Before
    public void initialObject() {
        multidimensionalArray = new MultidimensionalArray();
    }

    @Test
    public void should_return_2_dimension_int_array() {
        Assert.assertEquals(2, multidimensionalArray.generateMultidimensionalArray().length);
    }

    @Test
    public void should_return_3_dimension_int_array(){
        Assert.assertEquals(2,multidimensionalArray.generate3DimensionlIntArray().length);
        Assert.assertEquals(2,multidimensionalArray.generate3DimensionlIntArray()[0].length);
    }

}
