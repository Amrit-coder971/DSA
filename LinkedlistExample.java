// Class representing a Node in the linked list
class Node {
    int data; // Stores the data value
    Node next; // Pointer to the next node

    // Constructor to initialize a new node with data
    public Node(int data) {
        this.data = data;
        // Explicitly setting next to null
        this.next = null;
    }
}

// Class representing the Linked List
class LinkedList {
    Node head; // Head (first node) of the linked list

    // Method to insert a new node at the end of the linked list
    public void insertAtLast(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the linked list is empty, set head to the new node
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach the new node to the last node
        temp.next = newNode;
    }

    // Method to print the linked list elements
    public void print() {
        // If the list is empty, print a message and return
        if (head == null) {
            System.out.println("No element in the Linked List");
            return;
        }

        Node temp = head; // Start from the head

        // Traverse and print all elements
        while (temp != null) {
            System.out.print(temp.data); // Print data

            // Print an arrow only if there's a next node
            if (temp.next != null) {
                System.out.print(" --> ");
            }

            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Move to the next line after printing all elements
    }
}

// Main class to test the LinkedList implementation
public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); // Create an empty linked list

        // Insert elements into the linked list
        linkedList.insertAtLast(1);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(3);
        // linkedList.insertAtLast(4);

        // Print the linked list elements
        System.out.println("Print after insertion:");
        linkedList.print();
        linkedList.insertAtLast(4);
        linkedList.print();

    }
}
