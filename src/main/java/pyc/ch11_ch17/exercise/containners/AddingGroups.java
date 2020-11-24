package pyc.ch11_ch17.exercise.containners;

import java.util.*;

/**
 * @author pi
 */
public class AddingGroups {


    public Collection<Integer> addElementsByWayOne() {
        Collection collection = new ArrayList(Arrays.asList(1,2,3));
        Integer[] addElements = {4,5};

        collection.addAll(Arrays.asList(addElements));
        return collection;
    }

    public Collection addElementsByWayTwo() {
        Collection collection = new ArrayList(Arrays.asList(1,2,3));
        Collections.addAll(collection,4,5,6,7,8);
        return collection;
    }

    public Collection addElementsByWayThree() {
        Collection collection = new ArrayList(Arrays.asList(1,2,3));

        Integer[] a = {4,5,6};
        Collections.addAll(collection,a);
        System.out.println(collection);
        return collection;
    }

    public List<Object> listSet() {
        List list = new ArrayList(Arrays.asList(1,2,3));
        list.set(0,8);
        return list;
    }
}
