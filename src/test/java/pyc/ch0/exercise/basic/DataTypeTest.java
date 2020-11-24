package pyc.ch0.exercise.basic;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/11/24 14:42:55
 */
public class DataTypeTest {
    @Test
    public void should_return_10_after_data_convert() throws Exception {
        CustomDataType dataType = new CustomDataType();
        assertThat(dataType.convertBasicDoubleToBasicInt(9.997), is(10));
    }

    @Test
    public void should_return_2_point_5_when_a_int_plus_a_float() throws Exception {
        CustomDataType customDataType = new CustomDataType();
        assertThat(customDataType.floatPlusInt(1, 1.5), is(2.5));
    }

    @Test
    public void should_return_int_when_use_operation_plus_equls() throws Exception {
        CustomDataType customDataType = new CustomDataType();
        assertThat(customDataType.plusEqual(1, 0.1), is(1));
    }

    @Test
    public void should_return_Hel_when_input_Hello() throws Exception {
        CustomDataType customDataType = new CustomDataType();
        assertThat(customDataType.extractSubString("Hello", 3), is("Hel"));
    }

    @Test
    public void should_return_string_join_by_custom_sign() throws Exception {
        CustomDataType customDataType = new CustomDataType();
        assertThat(customDataType.joinStringBySign("/", "1", "2", "3"), is("1/2/3"));
        assertThat(customDataType.joinStringBySign("|", "1", "2", "3", "0"), is("1|2|3|0"));
    }
}
