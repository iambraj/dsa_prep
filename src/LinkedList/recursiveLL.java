package LinkedList;

public class recursiveLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive method to print linked list
    public static void printList(Node head) {
        if (head == null) {
            return; // Base case: if the node is null, return
        }
        System.out.print(head.data + " "); // Print the data of the current node
        printList(head.next); // Recursively call the next node
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Call the recursive print function
        printList(a);
    }
}
