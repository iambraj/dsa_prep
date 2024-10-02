package stacks;

import java.util.*;

public class implementation {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(16);
        st.push(2);
        st.push(1);

        System.out.println("Original Stack: " + st);

        Stack<Integer> rt = new Stack<>();

        // Transfer elements from st to rt until only two remain in st
        while (st.size() > 2) {
            rt.push(st.pop());
        }

        // Push an additional element onto rt
        rt.push(13);
        System.out.println("Stack rt after adding 13: " + rt);

        // Restore the two remaining elements from st to rt
        while (!st.isEmpty()) {
            rt.push(st.pop());
        }

        // Reverse the elements in rt to ts
        Stack<Integer> ts = new Stack<>();
        while (!rt.isEmpty()) {
            ts.push(rt.pop());
        }

        System.out.println("Final Stack ts after reversing: " + ts);


//        Stack<Integer> st = new Stack<>();
//
//        System.out.println("size is: " + st.size()); // size is 0
//        System.out.println(st); // []
//
//        st.push(1);
//        System.out.println("size is: " + st.size()); // size is 1
//        System.out.println(st); // [1]
//
//        st.push(23);
//        System.out.println("size is: " + st.size()); // size is 2
//        System.out.println(st); // [1, 23]
//
//        st.push(90);
//        System.out.println("size is: " + st.size()); // size is 3
//        System.out.println(st); // [1, 23, 90]
//
//        st.push(5);
//        System.out.println("size is: " + st.size()); // size is 4
//        System.out.println(st); // [1, 23, 90, 5]
//
//        st.push(34);
//        System.out.println("size is: " + st.size()); // size is 5
//        System.out.println(st); // [1, 23, 90, 5, 34]



//
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//
//        System.out.println("Enter the number of elements you want to push into the stack:");
//        int n = sc.nextInt(); // Read the number of elements
//
//        System.out.println("Enter the elements: ");
//        for (int i = 1; i <= n; i++) {
//            int x = sc.nextInt(); // Read each element
//            st.push(x); // Push the element onto the stack
//        }
//
//        System.out.println("Stack elements are: " + st); // Display the stack
    }
}


