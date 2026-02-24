package leetcode;
/*
    701 - Insert into a Binary Search Tree
    Topic: BST / Recursion
    Time: O(h)
    Notes: Recursively insert value into BST by traversing left or right subtree.
*/
public class _0701_Insert_into_a_Binary_Search_Tree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val <= val){
            root.right = insertIntoBST(root.right, val);
        }else if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
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
}
