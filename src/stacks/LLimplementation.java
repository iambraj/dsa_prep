package stacks;

public class LLimplementation {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack {
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        void displayrec(Node h) {
            if (h == null) return;
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void displayrev() {
            displayrec(head);
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.push(4);
        st.displayrev();

        st.push(5);
        st.displayrev();

        st.push(1);
        st.displayrev();

        System.out.println(st.size());

        st.pop();
        st.displayrev();

        System.out.println(st.size());

        st.push(7);
        st.push(0);
        st.displayrev();
    }
}
