package pyc.algorithm;

import java.util.Iterator;

/**
 * @author pi
 * @date 20/12/10 13:55:28
 */
public class FixedCapacityStack<E> implements Iterable<E> {
    private E[] data;
    private int elementSize;

    public FixedCapacityStack() {
    }

    public FixedCapacityStack(int cap) {
        data = (E[]) new Object[cap];
    }

    public int size() {
        return elementSize;
    }

    public void push(E item) {
        if (elementSize == data.length) {
            resize(2 * data.length);
        }
        data[elementSize++] = item;
    }

    public E pop() {
        E item = data[--elementSize];
        data[elementSize] = null;
        if (elementSize > 0 && elementSize <= data.length / 4) {
            resize(data.length / 2);
        }
        return item;
    }

    private void resize(int newSize) {
        E[] tempData = (E[]) new Object[newSize];
        for (int i = 0; i < elementSize; i++) {
            tempData[i] = data[i];
        }
        data = tempData;
    }

    /**
     * 迭代器方法
     *
     * @return
     */
    public Iterator<E> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<E> {
        private int i = elementSize;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public E next() {
            return data[--i];
        }

        @Override
        public void remove() {
        }
    }
}
