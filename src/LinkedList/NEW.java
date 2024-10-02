package LinkedList;

public class NEW {

    // Node class to represent each element of the list
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail pointers for the linked list
    Node head = null;
    Node tail = null;

    // Method to insert a new node at the end of the linked list
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) { // If the list is empty
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // Method to calculate the size of the linked list
    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Method to display the elements of the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NEW ll = new NEW();  // Corrected class name

        ll.insertAtEnd(4);  // Inserts 4 -> list becomes: 4
        ll.insertAtEnd(5);  // Inserts 5 -> list becomes: 4 5

        ll.display();  // Output: 4 5
        System.out.println();

        System.out.println(ll.size());  // Output: 2
    }
}
