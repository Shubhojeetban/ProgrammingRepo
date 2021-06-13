/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BinaryTreePreorederTraversalIterative {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null)
            return list;
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode it = stack.pollLast();
            list.add(it.val);
            if(it.right != null)
            stack.add(it.right);
            if(it.left != null)
            stack.add(it.left);
        }
        return list;
    }
}
