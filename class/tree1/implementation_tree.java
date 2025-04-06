public class implementation_tree{
    public static class Node{
        int val;
        Node left; //left child
        Node right; //right child
        // public Node(int val){
        //     this.val = val;
        // }
    }
    public static void main(String args[]){
        Node root = new Node();
        root.val = 10; //ban gaya node

        System.out.println(root.val);

    }
}