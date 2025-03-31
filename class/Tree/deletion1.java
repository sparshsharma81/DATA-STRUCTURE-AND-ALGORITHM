

 class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = right = null; //bydefault ye dono null hoge..
        }
        //this is how n-array tree node is maken...
        //interview...
        
    }


public class deletion1{
    Node root;
    private Node findMin(Node root){
        while(root.left!=null){
        root = root.left;

    }
    return root;

    }

    //this function will delete node at particular key....
    public Node deleteNode(Node root,int key){
        if(root == null) return root;


        //step1.--- find the node to be deleted ...
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }
        else if(key>root.data){
            root.right = deleteNode(root.right, key);
        }
        else{
            
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }


            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, root.data);

            
        }
return root;
      


    }

      public void inorder(Node root){
            if(root!=null){
                inorder(root.left);
                System.out.print(root.data+ " ");
                inorder(root.right);
                //basic recurrsion approach to find the inorderr---
            }
        }
    
   
    public static void main(String args[]){
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
