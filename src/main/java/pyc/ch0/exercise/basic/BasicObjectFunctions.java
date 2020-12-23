package pyc.ch0.exercise.basic;

/**
 * @author pi
 * @date 20/12/23 11:16:13
 */
public class BasicObjectFunctions {

    public boolean isInstanceOfBaseClass(BasicChildClass basicChildClass) {
        return (basicChildClass instanceof BasicBaseClass);
    }

    public boolean isBaseObjInstanceOfChildClass(BasicBaseClass basicBaseClass) {
        return basicBaseClass instanceof BasicChildClass;
    }
}
