package stacks;


public class arrayimplementation {
    public static class Stack {
        private int[] arr = new int[50];
        private int idx = 0;


        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x; // Add the element to the array
            idx++; // Increment the index to point to the next free spot
        }

        // Pop method to remove and return the top element
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx - 1]; // Get the top element
            arr[idx - 1] = 0; // Remove the element from the stack
            idx--; // Decrement the index
            return top; // Return the popped element
        }

        // Peek method to get the top element without removing it
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx - 1]; // Return the top element
        }

        // Method to display all elements in the stack
        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // Move to the next line after displaying the elements
        }

        // Method to get the current size of the stack
        int size() {
            return idx; // Return the number of elements in the stack
        }

        // Method to check if the stack is empty
        boolean isEmpty() {
            return idx == 0; // Return true if no elements are in the stack
        }

        // Method to check if the stack is full
        boolean isFull() {
            return idx == arr.length; // Return true if the stack is full
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(4);
        st.display(); // Output: 4

        st.push(5);
        st.display(); // Output: 4 5

        st.push(1);
        st.display(); // Output: 4 5 1

        System.out.println("Size: " + st.size()); // Output: Size: 3

        st.pop();
        st.display(); // Output: 4 5

        System.out.println("Size: " + st.size()); // Output: Size: 2

        st.push(7);
        st.push(0);
        st.display(); // Output: 4 5 7 0

        System.out.println("Is stack full? " + st.isFull()); // Output: false

        System.out.println("Top element: " + st.peek()); // Output: Top element: 0
    }
}
