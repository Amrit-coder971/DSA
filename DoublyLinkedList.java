
class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data; 
    }
}

public class DoublyLinkedList {
    private Node head = null;

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        newNode.prev = null;
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public void insertAfterNode(int position, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        while (position-- > 0 && temp != null) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position is out of bounds");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        if (head.next != null) {
            head.next.prev = null;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.prev.next = null;
    }

    public void deleteSpecificNode(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;

        if (position == 0) {
            head = temp.next;
            if (temp.next != null) {
                temp.next.prev = null;
            }
            return;
        }

        for (int i = 0; temp != null && i < position; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position does not exist");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertAtBeginning(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtBeginning(0);
        list.insertAfterNode(1, 10);
        list.printList();
        list.deleteAtBeginning();
        list.printList();
        list.deleteAtEnd();
        list.printList();
        list.deleteSpecificNode(1);
        list.printList();
    }
}