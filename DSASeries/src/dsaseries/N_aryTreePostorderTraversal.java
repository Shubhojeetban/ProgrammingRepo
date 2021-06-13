/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class N_aryTreePostorderTraversal {
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
    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        if(root == null) return list;
        
        stack.add(root);
        while(!stack.isEmpty()){
            Node i = stack.pop();
            list.addFirst(i.val);
            for(Node it : i.children){
                stack.add(it);
            }
        }
        return list;
    }
}
}
