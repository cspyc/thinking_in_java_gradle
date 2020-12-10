package pyc.algorithm;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/12/09 11:38 PM
 **/
public class FixedCapacityStackOfStringsTest {
    @Test
    public void should_return_0_when_get_the_initial_object_with_fixed_size() throws Exception {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(10);
        assertThat(fixedCapacityStackOfStrings.size(), is(0));
    }

    @Test
    public void should_return_1_when_push_1_item_into_stack() throws Exception {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(10);
        fixedCapacityStackOfStrings.push("HelloWorld！");
        assertThat(fixedCapacityStackOfStrings.size(), is(1));
    }

    @Test
    public void should_return_hello_when_pop_the_pushed_item() throws Exception {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(10);
        fixedCapacityStackOfStrings.push("hello");
        assertThat(fixedCapacityStackOfStrings.pop(), is("hello"));
        assertThat(fixedCapacityStackOfStrings.size(), is(0));
    }

    @Test
    public void should_return_false_when_push_item_into_the_stack() throws Exception {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(10);
        fixedCapacityStackOfStrings.push("Hello");
        assertThat(fixedCapacityStackOfStrings.isEmpty(), is(false));
    }

    @Test
    public void should_read_file_text() throws Exception {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(100);
        File file = new File("src/test/resources/tobe.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = "";
        while ((s = bufferedReader.readLine()) != null) {
            if (!s.equals("-")) {
                fixedCapacityStackOfStrings.push(s);
            } else if (!fixedCapacityStackOfStrings.isEmpty()) {
                System.out.println(fixedCapacityStackOfStrings.pop() + " ");
            }
        }
        System.out.println("(" + fixedCapacityStackOfStrings.size() + " left on stack)");
        bufferedReader.close();
        reader.close();
    }
}
