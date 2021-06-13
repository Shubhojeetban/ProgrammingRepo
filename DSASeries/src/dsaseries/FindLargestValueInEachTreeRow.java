/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import dsaseries.MaximumDepthOfBinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author ACER
 */
public class FindLargestValueInEachTreeRow {
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper_method(root, list, 0);
        return list;
    }
    
    public void helper_method(TreeNode root, List<Integer> list, int level)
    {
        if(root == null)
            return;
        else
        {
            if(list.size() == level)
                list.add(root.val);
            else
                list.set(level, Math.max(list.get(level), root.val));
        }
        
        helper_method(root.left, list, level+1);
        helper_method(root.right, list, level+1);
    }
    
    //This is another solution using BFS Traversal, better and clear
    public List<Integer> largestValuesBFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int max  = Integer.MIN_VALUE;
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = q.poll();
                max = Math.max(max, node.val);
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            list.add(max);
        }
        return list;
    }
}
