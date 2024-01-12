package HashMap;

import java.util.HashMap;

/*
 * Adding Element to HashMap
 * Changing Element to HashMap
 * Removing Element from HashMap
 * Traversal of Hashmap
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        /* Adding Element to HashMap */

        map.put(1, "sachin");
        map.put(3, "Raj");
        map.put(2, "Minal");
        map.put(5, "Abhishek");
        map.put(4, "Saurav");

        System.out.println(map);

        /* Changing Element to HashMap */
        map.put(4, "singh");
        System.out.println(map);

        // Removing Element from HashMap
        map.remove(5);
        System.out.println(map);

        System.out.println(map.remove(1, "raj"));
        System.out.println(map);

        // Traversal of Hashmap

    }

}
