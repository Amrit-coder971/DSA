
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtfirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;

        head = newNode;
    }

    public void DeleteAtfirst(int data) {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    // public void print() {

    // if (head == null) {
    // System.out.println("No element in the Linked List");
    // return;
    // }

    // Node temp = head;

    // while (temp != null) {
    // System.out.print(temp.data);
    // if (temp.next != null) {
    // System.out.print(" --> ");
    // }

    // temp = temp.next;
    // }
    // System.out.println();
    // }

    // new print form
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteATfirst {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtfirst(1);
        list.insertAtfirst(2);
        list.insertAtfirst(3);
        list.insertAtfirst(4);
        list.insertAtfirst(5);
        list.print();

        list.DeleteAtfirst(3);
        list.print();

    }

}
