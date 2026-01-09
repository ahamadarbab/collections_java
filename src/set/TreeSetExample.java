package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // Declaring TreeSet
        Set<String> set1 = new TreeSet<>();


        // adding elements in the TreeSet
        set1.add("Guava");
        set1.add("Mango");
        set1.add("Pineapple");
        set1.add("Apple");
        set1.add("Orange");
        set1.add("Mango");
        set1.add("Banana");
        set1.add("Melon");

        System.out.println("Elements of set1 are : " + set1);


        // removing elements from the TreeSet
        set1.remove("Guava");
        set1.remove("Mango");

        System.out.println("set1 after deleting 2 elements : " + set1);


        // traverse TreeSet using foreach
        System.out.println("Traversing TreeSet using foreach : ");
        for(String s1 : set1)
        {
            System.out.println(s1);
        }
    }
}
