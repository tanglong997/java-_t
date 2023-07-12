package s94_inorderTraversal.Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

     public class TreeNode {
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
 }
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
         if (root == null){
             return list;
         }
         inorderTraversal(root.left);
         list.add(root.val);
         inorderTraversal(root.right);

        return list;
    }



}
