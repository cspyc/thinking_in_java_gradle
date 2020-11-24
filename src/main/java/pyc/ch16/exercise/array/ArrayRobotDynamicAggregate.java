package pyc.ch16.exercise.array;

public class ArrayRobotDynamicAggregate extends ArrayRobot {
    @Override
    public Object[] produceArray() {
        //Dynamic aggregate initialization
        BerylliumSphere[] a;//local uninitialized variable

        a = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
        return a;
    }
}
