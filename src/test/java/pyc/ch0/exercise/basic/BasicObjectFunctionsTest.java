package pyc.ch0.exercise.basic;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/12/23 11:12:59
 */
public class BasicObjectFunctionsTest {
    @Test
    public void should_return_true_if_objectA_is_instance_of_baseClass() throws Exception {
        BasicObjectFunctions basicObjectFunctions = new BasicObjectFunctions();
        BasicChildClass basicChildClass = new BasicChildClass();
        assertThat(basicObjectFunctions.isInstanceOfBaseClass(basicChildClass),is(true));
    }

    @Test
    public void should_return_true_if_objectA_is_instance_of_childClass() throws Exception {
        BasicObjectFunctions basicObjectFunctions = new BasicObjectFunctions();
        BasicBaseClass basicBaseClass = new BasicBaseClass();
        assertThat(basicObjectFunctions.isBaseObjInstanceOfChildClass(basicBaseClass),is(true));
    }
}
