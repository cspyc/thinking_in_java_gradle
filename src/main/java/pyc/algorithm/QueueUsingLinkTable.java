package pyc.algorithm;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author pi
 * @date 20/12/22 15:34:13
 */
public class QueueUsingLinkTable<E> implements Iterable<E> {
    private int queueSize;
    private Node first;
    private Node last;

    public QueueUsingLinkTable() {
        this(0, null, null);
    }

    public QueueUsingLinkTable(int queueSize, Node first, Node last) {
        this.queueSize = queueSize;
        this.first = first;
        this.last = last;
    }

    public E dequeue() {
        E item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        queueSize--;
        return item;
    }

    public boolean isEmpty() {
        return queueSize == 0;
    }

    private class Node {
        private E item;
        private Node next;
    }

    public int size() {
        return queueSize;
    }

    public void enqueue(E item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        queueSize++;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            current = current.next;
        }
    }
}
