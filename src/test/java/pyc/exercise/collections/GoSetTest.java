package pyc.exercise.collections;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/11/26 11:28:46
 */
public class GoSetTest {
    @Test
    public void should_return_true_when_set_contain_11L() throws Exception {
        GoSet goSet = new GoSet();
        goSet.addId(1L);
        goSet.addId(5L);
        goSet.addId(11L);
        assertThat(goSet.isPresentTemplateIdInExistedTemplateIds(11L), is(true));
        assertThat(goSet.isPresentTemplateIdInExistedTemplateIds(15L), is(false));
    }
}
