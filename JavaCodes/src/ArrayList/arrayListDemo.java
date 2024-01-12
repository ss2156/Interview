package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        /* Adding elemetnt to List */
        list.add(22);
        list.add(11);
        list.add(44);
        list.add(55);
        list.add(33);
        list.add(66);

        System.out.println(list);
        // [22, 11, 44, 55, 33, 66]

        /* changing elemetnt of List */
        list.set(2, 401);
        System.out.println(list);

        /* Removing elemetnt from List */
        list.remove(2);
        System.out.println(list);
        /******************* iterating on list ********************/
        // using iteratior
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("Iteratior : " + itr.next());
        }

        // using for-each loop
        for (int val : list) {
            System.out.println("For-each : " + val);
        }
        // using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("For Loop : " + list.get(i));
        }
        /************************************************************/

        /* get elemetnt of List */
        // int n = list.get(2);
        Integer n = list.get(2);
        System.out.println("Get element of index 2 : " + n);
        /* Adding elemtnt between two number into List */
        // add(int index, Integer element)
        list.add(3, 44);
        System.out.println(list);
        /* Sorting List */
        Collections.sort(list);
        System.out.println(list);
        /* ArrayList Size */
        int size = list.size();
        System.out.println("Size of the list = " + size);

    }

}
