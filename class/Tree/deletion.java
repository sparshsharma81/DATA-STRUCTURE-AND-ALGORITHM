class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class deletion {
    Node root;

    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public Node deleteNode(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);  // Fix: use temp.data here
        }

        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String args[]) {
        deletion1 tree = new deletion1();

        // Inserting nodes to form a BST
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.println("Inorder of the tree before deletion:");
        tree.inorder(tree.root);

        // Deleting node with two children (50)
        tree.root = tree.deleteNode(tree.root, 50);

        System.out.println("\nInorder after deleting 50:");
        tree.inorder(tree.root);
    }
}
