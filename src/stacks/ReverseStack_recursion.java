package stacks;
import java.util.Stack;
public class ReverseStack_recursion {
    // Function to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        // Pop the top element and recursively call pushAtBottom
        int top = st.pop();
        pushAtBottom(st, x);
        // Push the popped element back after the recursive call
        st.push(top);
    }
    // Function to reverse the stack
    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) {
            return;  // Base case: if the stack is empty, do nothing
        }
        // Pop the top element and recursively reverse the remaining stack
        int top = st.pop();
        reverse(st);
        // Push the popped element at the bottom of the stack
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Pushing elements onto the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);
        // Reverse the stack
        reverse(st);
        System.out.println("Reversed Stack: " + st);
    }
}


