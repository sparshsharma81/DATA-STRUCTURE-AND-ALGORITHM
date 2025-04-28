
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

public class Image_tree_node {
    public static boolean isMirror(TreeNode p,TreeNode q){
        if(p == null && q == null ) return true; //ye dono equal hai..kyuki empty hai

        if(p == null || q == null || p.val != q.val) return false; //ye dono equal hai....

        return (isMirror(p.right,q.left) && isMirror(p.left, q.right)) && p.val == q.val;
        //basically parent node same hogi... p node k right side se q node ka left side compare hoga..
        //p node k left side k saath q node ka right side compare hoga...
        //p aur q node ki value check ho rahi hai
        
        
    }
    public static void main(String[] args) {
        /*
         check if left subtree is a mirror image of right subtree or not---
         return boolean value
         */

         TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.left.left = new TreeNode(3);
          root.left.right = new TreeNode(4);

          TreeNode root2 = new TreeNode(1);
          root2.left = null;
          root2.right = new TreeNode(2);
          root2.right.left = new TreeNode(4);
          root2.right.right= new TreeNode(3);
          System.out.println(isMirror(root,root2));

          //the testing of github is done and it is working fine ...



    }
}
