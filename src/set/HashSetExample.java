package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        // Declaring HashSet
        Set<String> set1 = new HashSet<>();

        // adding elements in the HashSet
        set1.add("Guava");
        set1.add("Mango");
        set1.add("Pineapple");
        set1.add("Apple");
        set1.add(null);
        set1.add("Orange");
        set1.add("Mango");
        set1.add("Banana");
        set1.add("Melon");

        System.out.println("Elements of set1 are : " + set1);

        // removing elements from the HashSet
        set1.remove("Guava");
        set1.remove("Mango");

        System.out.println("set1 after deleting 2 elements : " + set1);

        // traverse HashSet using foreach
        System.out.println("Traversing HashSet using foreach : ");
        for(String s1 : set1)
        {
            System.out.println(s1);
        }

    }
}
