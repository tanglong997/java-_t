package s106_levelOrderBottom;



import java.util.ArrayList;
import java.util.List;
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

}
public class Solution {

    private List<List<Integer>> list = new ArrayList<List<Integer>>();
    private List<List<Integer>> list1 = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        middle_order(root,1);
        for (int i = list.size()-1; i >=0;i--){
            list1.add(list.get(i));
            list.remove(i);
        }
        return list1;
    }
    public void middle_order(TreeNode root, int h){
        if (root==null){
            return;
        }

        if (h>list.size()){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(root.val);
            list.add(arrayList);
        }else {
            List<Integer> list1 = list.get(h-1);
            list1.add(root.val);
        }

        middle_order(root.left,h+1);
        middle_order(root.right,h+1);

    }
}
