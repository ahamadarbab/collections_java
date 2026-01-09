package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // declaring stack
        Stack<String> stck1 = new Stack<>();

        // add/push data into stack
        stck1.push("Guava");
        stck1.push("Mango");
        stck1.push("Pineapple");
        stck1.push("Banana");
        stck1.push("Apple");
        stck1.push("Orange");
        stck1.push("Melon");

        System.out.println("Elements of stck1 are : " + stck1);

        // pop/remove data from stack
        stck1.pop();
        System.out.println("stck1 after 1st pop : " + stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop : " + stck1);

        // getting top element of the stack
        System.out.println("Top element of stack is : " + stck1.peek());

        // traverse using foreach loop
        System.out.println("Traverse using foreach");
        for(String s1 : stck1)
        {
            System.out.println(s1);
        }
    }
}
