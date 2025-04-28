
// Node class
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// BinaryTree class
public class BinaryTree {
    Node root;

    // In-order traversal (Left, Root, Right)
    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually creating tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
    }
}