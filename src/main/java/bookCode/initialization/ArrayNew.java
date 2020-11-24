package bookCode.initialization;//: initialization/ArrayNew.java
// Creating arrays with new.

import java.util.Arrays;
import java.util.Random;

import static java.bookCode.net.mindview.util.Print.*;
import static java.bookCode.net.mindview.util.Print.print;

public class ArrayNew {
  public static void main(String[] args) {
    int[] a;
    Random rand = new Random(47);
    a = new int[rand.nextInt(20)];
    print("length of a = " + a.length);
    print(Arrays.toString(a));
  }
} /* Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*///:~
