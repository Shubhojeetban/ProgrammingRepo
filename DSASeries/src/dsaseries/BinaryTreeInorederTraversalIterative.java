/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import dsaseries.MaximumDepthOfBinaryTree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class BinaryTreeInorederTraversalIterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        
        if(root == null)
            return list;
        
        Stack<TreeNode> stack = new Stack<>();
        
        //we have to keep track for the left subtree
        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }
        return list;
    }
}
