package pyc.functionalprogram.property;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pi
 * @date 2020/8/14 14:56:25
 */
public class PropertiesProcessTest {
    private Properties properties;
    private PropertiesProcess propertiesProcess;

    @Before
    public void setFixture() {
        propertiesProcess = new PropertiesProcess();
        properties = new Properties();
        properties.setProperty("a", "5");
        properties.setProperty("b", "true");
        properties.setProperty("c", "-3");
    }

    @Test
    public void should_return_int_5() throws Exception {
        int keyValue = propertiesProcess.readDuration(properties, "a");
        Assert.assertEquals(5, keyValue);
    }

    @Test
    public void should_return_int_0() throws Exception {
        int keyValue = propertiesProcess.readDuration(properties,"b");
        Assert.assertEquals(0,keyValue);
    }

    @Test
    public void should_return_int_0_when_get_negative_number() throws Exception {
        int keyValue = propertiesProcess.readDuration(properties,"c");
        Assert.assertEquals(0,keyValue);
    }

    @Test
    public void should_return_int_0_when_get_not_exits_key() throws Exception {
        int keyValue  = propertiesProcess.readDuration(properties,"d");
        Assert.assertEquals(0,keyValue);
    }

}
