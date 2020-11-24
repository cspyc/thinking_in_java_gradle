package pyc.ch16.exercise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pi
 */
public class ArrayOfGenerics {
    public static void main(String[] args) {


        //无法直接创建带泛型的数组，
        //但是可以先创建引用,再转型 List<String>[] ls = new ArrayList<String>[10];

        List<String>[] ls;

        List[] la = new ArrayList[10];

        ls = (List<String>[]) la;

        ls[0] = new ArrayList<String>();

        Object[] objects = ls;

        objects[1] = new ArrayList<Integer>();


        Object[] test = new Object[10];
        test[0] = new String("l");
        test[1] = new Integer(1);
        test[2] = new Double(2.2);
        Arrays.fill(test,"test");

        System.out.println(Arrays.deepToString(test));
    }
}
