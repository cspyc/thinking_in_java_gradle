package pyc.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/12/10 13:54:32
 */
public class FixedCapacityStackTest {
    @Test
    public void should_return_1_when_push_1_item_into_stack() throws Exception {
        FixedCapacityStack fixedCapacityStack = new FixedCapacityStack(10);
        fixedCapacityStack.push("1");
        assertThat(fixedCapacityStack.size(), is(1));
    }

    @Test
    public void should_return_hello_when_push_hello_into_stack() throws Exception {
        FixedCapacityStack<String> stringFixedCapacityStack = new FixedCapacityStack<>(10);
        stringFixedCapacityStack.push("hello");
        assertThat(stringFixedCapacityStack.pop(), is("hello"));
    }

    @Test
    public void should_double_stack_size_when_current_size_equals_stack_length() throws Exception {
        FixedCapacityStack<String> stringFixedCapacityStack = new FixedCapacityStack<>(1);
        stringFixedCapacityStack.push("hello");
        stringFixedCapacityStack.push("world");
        assertThat(stringFixedCapacityStack.size(), is(2));
    }
}
