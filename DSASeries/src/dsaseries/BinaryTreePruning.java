/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import dsaseries.MaximumDepthOfBinaryTree.TreeNode;

/**
 *
 * @author ACER
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return root;
        
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        
        if(root.left == null && root.right == null && root.val == 0) return null;
        
        return root;
    }
}
