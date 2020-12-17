package pyc.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/12/17 19:27:41
 */
public class StackUsingLinkTest {
    @Test
    public void should_return_false_if_have_element_in_stack() throws Exception {
        StackUsingLink<String> stackUsingLink = new StackUsingLink<String>();
        stackUsingLink.push("1");
        assertThat(stackUsingLink.isEmpty(), is(false));
    }

    @Test
    public void should_pop_hello_when_push_hello_into_stack() throws Exception {
        StackUsingLink<String> stackUsingLink = new StackUsingLink<String>();
        stackUsingLink.push("hello");
        assertThat(stackUsingLink.pop(), is("hello"));
    }

    @Test
    public void should_should_return_size_1_when_push_1_item_into_stack() throws Exception {
        StackUsingLink<String> stackUsingLink = new StackUsingLink<String>();
        stackUsingLink.push("what");
        assertThat(stackUsingLink.size(), is(1));
    }

    @Test
    public void should_push_Long_type_into_stack() throws Exception {
        StackUsingLink<Long> stackUsingLink = new StackUsingLink();
        stackUsingLink.push(new Long(1111L));
        assertThat(stackUsingLink.pop(), is(1111L));
    }

    @Test
    public void should_push_multiple_item_into_stack() throws Exception {
        StackUsingLink<String> stringStackUsingLink = new StackUsingLink<>();
        stringStackUsingLink.push("hello");
        stringStackUsingLink.push("word");
        assertThat(stringStackUsingLink.size(), is(2));
        assertThat(stringStackUsingLink.pop(), is("word"));
    }
}
