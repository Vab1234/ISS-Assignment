package Java.Collections_Framework;

import java.util.*;

public class Primitives {
    public static void main(String args[]){

        // Lists : Maintains insertion order, allows duplicates and Implements List interface
        List<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("Audi");
        list.add("Mercedes");
        list.add("Volkswagen");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Toyota");
        list2.add("Honda");

        Collections.sort(list);
        System.out.println("First element: " + list.get(0));
        list.set(0, "Lamborghini");
        list.addAll(list2);

        // Iteration using iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Iteration using for-each loop
        for(String car : list){
            System.out.println(car);
        }

        // Sets : Does not allow duplicates and Implements Set interface
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30); // Duplicate value, will not be added

        System.out.println("Set elements: " + set);


        // Maps : Stores key-value pairs and Implements Map interface, Sets use map at the backend to store values by converting the value to a key and storing it in the map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Map elements: " + map);
        // Iterating over the map using entrySet() method
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
