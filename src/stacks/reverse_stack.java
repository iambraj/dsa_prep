package stacks;

import java.util.Stack;
   public  class reverse_stack{
//       static void reverse(Stack<Integer> s) {
//           // Create a temporary stack
//           Stack<Integer> st = new Stack<>();
//
//           // Move all elements from the original stack to the temporary stack
//           while (!s.isEmpty()) {
//               st.push(s.pop());
//           }
//
//           Stack<Integer> rt = new Stack<>();
//           while (!st.isEmpty()) {
//               rt.push(st.pop());
//           }
//           // Move all elements back to the original stack
//           while (!rt.isEmpty()) {
//               s.push(rt.pop());
//           }
//       }





       static void displayreversestack(Stack<Integer>st){
           if (st.size()==0) return;
           int x = st.pop();
           System.out.println(x+" ");
           displayreversestack(st);
           st.push(x);
       }

       static void displayrever(Stack<Integer>st){
           if (st.size()==0) return;
           int x = st.pop();
           displayrever(st);
           System.out.println(x+" ");
           st.push(x);
       }



       public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();

            // Adding elements to the stack
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);

           // System.out.println("Original Stack: " + st);
            // Reverse the stack
           // reverse(stack);
              displayreversestack(st);
          // displayrever(st);
           // System.out.println("Reversed Stack: " + st);
        }
    }


