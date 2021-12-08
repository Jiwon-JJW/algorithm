import java.util.ArrayList;
import java.util.List;

public class TwoSumIvInputIsABst {
    public boolean findTarget(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();

        inputList(root, list);

        int low = 0;
        int high = list.size() - 1 ;

        while (low < high) {
            if(list.get(low) + list.get(high) < k) {
                low++;
            } else if (list.get(low) + list.get(high) > k) {
                high--;
            } else {
                return true;
            }
        }
        return false;
    }

    public void inputList(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }

        inputList(root.left, list);
        list.add(root.val);
        inputList(root.right, list);
    }
}

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
