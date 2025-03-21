class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
       //this is tree initilisation
   
}
public class tree2 {
    public static void main(String args[]){

        TreeNode node = new TreeNode(3);



        node.left = new TreeNode(9);
       node.right = new TreeNode(19);
       node.left.left = new TreeNode(1);
       node.left.right = new TreeNode(12);
       node.right.left = new TreeNode(4);
       node.right.right = new TreeNode(9) ;




    }
}
