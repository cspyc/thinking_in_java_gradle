package pyc.algorithm;

/**
 * @author pi
 * @date 20/12/17 20:23:45
 */
public class StackUsingLink<E> {
    private Node first;
    private int size;

    public int size() {
        return size;
    }

    private class Node {
        E item;
        Node next;
    }

    public StackUsingLink() {
    }

    public void push(E item) {
        //向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E pop() {
        //从栈顶删除元素
        E item = first.item;
        first = first.next;
        size--;
        return item;
    }

}
