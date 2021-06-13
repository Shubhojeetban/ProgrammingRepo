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
public class MergeTwoSortedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode curr_Node = tempNode;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr_Node.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr_Node.next = l2;
                l2 = l2.next;
            }
            curr_Node = curr_Node.next;
        }
        
        if(l1 != null)
        {
            curr_Node.next = l1;
            l1 = l1.next;
        }
        
        if(l2 != null)
        {
            curr_Node.next = l2;
            l2 = l2.next;
        }
        return tempNode.next;
    }
}
