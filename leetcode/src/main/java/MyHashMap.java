
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
    List<Integer> keys;
    List<Integer> values;

    /** Initialize your data structure here. */
    public MyHashMap() {
        keys = new LinkedList<>();
        values = new LinkedList<>();
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = keys.indexOf(key);

        if(index >= 0) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = keys.indexOf(key);

        if(index >= 0) {
            return values.get(index);
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = keys.indexOf(key);

        if(index >= 0) {
            values.remove(index);
        }
    }
}
