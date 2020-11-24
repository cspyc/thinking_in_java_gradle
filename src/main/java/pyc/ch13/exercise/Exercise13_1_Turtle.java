package pyc.ch13.exercise;

import java.io.PrintStream;
import java.util.*;

public class Exercise13_1_Turtle {
	
	private String name;
	private Formatter f;
	public Exercise13_1_Turtle(String name,Formatter f) {
		this.name = name;
		this.f = f;
	}
	
	public void move(int x,int y) {
		f.format("%s The Turtle is at (%d,%d)\n",name,x,y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream outAlias = System.out;
		
		Exercise13_1_Turtle tommy = new Exercise13_1_Turtle("Tommy",new Formatter(System.out));
		Exercise13_1_Turtle terry = new Exercise13_1_Turtle("Terry",new Formatter(outAlias));
		
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
		
		
	}

}
