/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

/**
 *
 * @author ACER
 */
public class MaximumDepthOfBinaryTree {
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
    private int answer=0;
    private void Depth(TreeNode root, int depth){
        if(root == null){
            answer = Math.max(answer, depth);
            return;
        }
        Depth(root.left, depth+1);
        Depth(root.right, depth+1);
    }
    public int maxDepth(TreeNode root) {
        Depth(root, 0);
        return answer;
    }
}
