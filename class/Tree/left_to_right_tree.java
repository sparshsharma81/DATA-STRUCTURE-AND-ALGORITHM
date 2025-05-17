
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
public class left_to_right_tree{
    public static void nthLevel(Node root, int n){
        if(root==null)return;
        if(n ==1){
             System.out.print(root.val +" ");
             return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);

    }
    public static void main(String args[]){
        //now we are traversing from left to right
        //the function will do the task
    }
}