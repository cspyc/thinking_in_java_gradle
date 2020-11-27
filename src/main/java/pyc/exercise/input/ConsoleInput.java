package pyc.exercise.input;

import java.io.Console;
import java.util.Scanner;

/**
 * @author pi
 * @date 20/11/27 16:27:57
 */
public class ConsoleInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ", Next year,you'll be " + (age + 1));
    }
}
