package pyc.ch16.exercise.array;


public class ArrayRobotAggregate extends ArrayRobot {

    @Override
    public Object[] produceArray() {
        BerylliumSphere[] berylliumSpheres = {
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()
        };
        return berylliumSpheres;
    }
}
