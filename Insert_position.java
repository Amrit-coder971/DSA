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

    void intertAfterNode(int position, int data) {
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; current != null && i < position; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("position is out of bouds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    // Method to print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to test the LinkedList
public class Insert_position {
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
        list.intertAfterNode(0, 1);
        list.print();

    }
}
