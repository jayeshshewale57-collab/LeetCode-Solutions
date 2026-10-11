/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void createTree(TreeNode newnode,TreeNode currentNode){
        if(newnode.val>currentnode.val){
            if(current.right==null){
                current.right=newnode;
                return;
            }
            createTree(newnode,currentNode.right);
        }
        if(newnode.val<currentnode.val){
            if(current.left==null){
                current.left=newnode;
                return;
            }
            createTree(newnode,currentNode.left);
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.isEmpty()){
            return null;
        }
        int size=nums.length;
        TreeNode root=new TreeNode(nums[size/2]);
        for(int i=0;i<size;i++){
            if(i==size/2){
                continue;
            }
            TreeNode newnode=new TreeNode(nums[i]);
            createTree(newnode,root);
        }
        return root;
    }
}