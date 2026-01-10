package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        //declaring LinkedList
        List<Integer> list1 = new LinkedList<>();

        // add elements into list
        list1.add(34);
        list1.add(65);
        //list1.add(null);
        list1.add(12);
        list1.add(34);
        list1.add(69);
        list1.add(55);
        list1.add(9);

        System.out.println("list1 is : " + list1);

        // remove elements from the list
        list1.remove(3);
        System.out.println("list1 after removing the 3rd index is : " + list1);

        list1.remove(1);
        System.out.println("list1 after removing the 1st index is : " + list1);

        // search element in the list
        System.out.println("2nd index element is : " + list1.get(2));
        System.out.println("4th index element is : " + list1.get(4));

        // size of the list
        System.out.println("list1 length is : " + list1.size());

        // sorting the list
        Collections.sort(list1);    //sort in ascending order
        System.out.println("list1 after sorting in ascending order : " + list1);

        Collections.sort(list1, Collections.reverseOrder());    //sort in descending order
        System.out.println("list1 after sorting in descending order : " + list1);

        // traversing the list using foreach loop
        System.out.println("traverse using foreach");
        for(Integer l1 : list1)
        {
            System.out.println(l1);
        }

    }
}
