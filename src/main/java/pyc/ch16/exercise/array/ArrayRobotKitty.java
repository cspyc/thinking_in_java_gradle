package pyc.ch16.exercise.array;

public class ArrayRobotKitty extends ArrayRobot {

    @Override
    public Object[] produceArray() {
        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }
        return c;

    }
}
