package pyc.ch19.exercise.enums;

import org.junit.Assert;
import org.junit.Test;


public class TestEnumClass {

    @Test
    public void should_return_CRAWLING_when_get_second_element_from_Shrubbery_valuse(){
        EnumClass ec = new EnumClass();
        Assert.assertEquals(Shrubbery.CRAWLING, ec.getEnumElement(1));

    }
}
