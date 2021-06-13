/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import dsaseries.MaximumDepthOfBinaryTree.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BinaryTreePreorederTraversalRecursive {
    private List<Integer> list =new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return list;
    }
}
