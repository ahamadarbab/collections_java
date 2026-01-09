package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        // declaring LinkedHashMap
        Map<Integer, String> map1  = new LinkedHashMap<>();

        // adding elements in the LinkedHashMap
        map1.put(105, "Guava");
        map1.put(110, "Apple");
        map1.put(100, "Grapes");
        map1.put(102, "Mango");
        map1.put(115, "Pomegranate");
        map1.put(107, "Grapes");
        map1.put(null, "Orange");
        map1.put(101, null);
        map1.put(120, "Pineapple");
        map1.put(110, "Kiwi");     // old value gets removed and new value gets added

        System.out.println("Elements of map1 are : " + map1);

        // removing elements from the LinkedHashMap
        map1.remove(100);
        System.out.println("map1 after 100 key remove : " + map1);

        map1.remove(101);
        System.out.println("map1 after 101 key remove : " + map1);

        // traversing LinkedHashMap
        System.out.println("Traverse LinkedHashMap using foreach - entryset");
        for(Map.Entry m1 : map1.entrySet())
        {
            System.out.println(m1.getKey() + " ---- " + m1.getValue());
        }
    }
}
