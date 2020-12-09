package pyc.exercise.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/12/7 14:23:23
 */
public class ListUtilTest {
    @Test
    public void should_return_two_subList_if_list_great_than_2() throws Exception {
        ListUtil listUtil = new ListUtil();
        List<String> originList = new ArrayList<>();
        originList.add("a");
        originList.add("b");
        originList.add("c");
        assertThat(listUtil.splitList(originList,2).size(),is(2));
    }
}
