package pyc.ch16.exercise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pyc
 */
public class ContainerComparison {
    public BerylliumSphere queryArrayElement(int elementPosition) {

        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere(i);
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        return spheres[elementPosition];
    }

    public BerylliumSphere queryListElement(int elementPosition) {
        List<BerylliumSphere> berylliumSpheres = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            berylliumSpheres.add(new BerylliumSphere(i));
        }
        System.out.println(berylliumSpheres);
        System.out.println(berylliumSpheres.get(elementPosition));
        return berylliumSpheres.get(elementPosition);
    }

    public int queryElementFromIntArray(int i) {
        int[] integers = {0,1,2,3,4};

        return integers[i];
    }

    public Integer queryElementFromIntegerList(int elementPosition) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        integers.add(97);
        return integers.get(elementPosition);
    }

}
