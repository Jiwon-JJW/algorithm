import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

    List<Integer> keys;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        keys = new LinkedList<>();
    }

    public void add(int key) {
        if (!keys.contains(key)) {
            keys.add(key);
        }
    }

    public void remove(int key) {
        int index = keys.indexOf(key);

        if(index >= 0){
            keys.remove(index);
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return keys.contains(key);
    }
}
