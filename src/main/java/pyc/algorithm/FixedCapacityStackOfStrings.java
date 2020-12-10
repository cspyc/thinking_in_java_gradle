package pyc.algorithm;

/**
 * @author pi
 * @date 2020/12/09 11:39 PM
 **/
public class FixedCapacityStackOfStrings {
    private String[] items;
    private int size;

    public FixedCapacityStackOfStrings() {
    }

    public FixedCapacityStackOfStrings(int cap) {
        this.items = new String[cap];
    }

    public int size() {
        return size;
    }

    public void push(String item) {
        items[size++] = item;
    }

    public String pop() {
        return items[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
