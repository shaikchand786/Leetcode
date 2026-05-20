/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head)
    {
        Set<Integer> set = new LinkedHashSet<>();

        // Store unique values
        while (head != null)
        {
            set.add(head.val);
            head = head.next;
        }
        // Create new list
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int num : set)
        {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return dummy.next;
    }
}