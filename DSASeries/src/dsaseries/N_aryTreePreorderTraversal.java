/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import java.util.*;

/**
 *
 * @author ACER
 */
public class N_aryTreePreorderTraversal {
    class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack= new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        
        if(root == null) return list;
        
        stack.add(root);
        
        while(!stack.isEmpty())
        {
            Node node = stack.pollLast();
            list.add(node.val);
            //So if we want the first child poll first we have to insert that at last
            Collections.reverse(node.children);
            for(Node it : node.children){
                stack.add(it);
            }
        }
        return list;
    }
}
}
