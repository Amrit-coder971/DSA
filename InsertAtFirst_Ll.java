// Node class represents each element in the linked list
class Node {
    int data;// Stores the data of the node
    Node next;// Reference to the next node

    // Constructor to initialize a node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the list
class LinkedList {
    Node head;// Head node of the linked list

    // Method to insert a new node at the beginning of the list
    public void insertAtfirst(int data) {
        Node newNode = new Node(data); // Create a new node

        if (head == null) {
            // If list is empty, make newNode the head
            head = newNode;
            return;
        }
        newNode.next = head;// Point newNode to the current head

        // Update head to newNode
        head = newNode;
    }

    // Method to print the linked list
    public void print() {

        if (head == null) {
            // If list is empty, print message
            System.out.println("No element in the Linked List");
            return;
        }
        // Start from the head
        Node temp = head;
        // Traverse the list
        while (temp != null) {
            // Print each node
            System.out.print(temp.data + "-->");
            // Move to the next node
            temp = temp.next;
        }
        // End of the list
        System.out.println("null");
    }
}

// Main class to test the LinkedList
public class InsertAtFirst_Ll {
    public static void main(String[] args) {
        // Create a linked list or object
        LinkedList list = new LinkedList();
        // Insert elements at the beginning or put value of element
        list.insertAtfirst(1);
        list.insertAtfirst(2);
        list.insertAtfirst(3);
        // Print the linked list

        System.out.println("Print after insert at first:");
        list.print();

    }
}
