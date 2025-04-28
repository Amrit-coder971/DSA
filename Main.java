class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    void insertAfterNode(int position, int data) {
        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; current != null && i < position; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position is out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    }

    void deleteSpecificNode(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position does not exist");
            return;
        }

        temp.next = temp.next.next;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        // linkedList.insertAtBeginning(0);
        // linkedList.insertAfterNode(1, 10);

        linkedList.printList();

        linkedList.deleteAtBeginning();
        linkedList.printList();

        linkedList.deleteAtEnd();
        linkedList.printList();

        linkedList.deleteSpecificNode(1);
        linkedList.printList();
    }
}
