public class intro1 {
    public static int size =0;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }

    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int size1(Node root){
        if(root == null) return 0;
        size++;
        size1(root.left);
        size1(root.right);
        return size;
    }
    public static int max1(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max1(root.left),max1(root.right)));
    }
    public static int height
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(5);
        root.left.left = new Node(12);
        root.left.right = new Node(15);
        root.right.left = new Node(121);
        root.right.right = new Node(1211);
        //agar kkuch na ho..to by default vo null hoga
        preorder(root);
        System.out.println(size1(root));
        System.out.println(max1(root));
    }
}
