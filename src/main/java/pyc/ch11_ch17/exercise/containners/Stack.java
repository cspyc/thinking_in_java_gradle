package pyc.ch11_ch17.exercise.containners;


import java.util.LinkedList;

/**
 * @author pi
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    //push
    public void push(T v) {
        storage.addFirst(v);
    }
    //peek
    public  T peek() {
        return storage.getFirst();
    }

    //pop

    public T pop(){
        return storage.removeFirst();
    }

    //isEmpty
    public boolean isEmpty(){
        return storage.isEmpty();
    }

    //toString
    @Override
    public String toString(){
        return storage.toString();
    }
}
