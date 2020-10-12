package leetcode_简单;

/**
 * Created by xieli on 2020/10/11.
 */
public class 相交链表 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast = headA, slow = headB;
        while (fast != slow) {
            //注意，此处细节有大问题
            fast = fast == null ? headB : fast.next;
            slow = slow == null ? headA : slow.next;
        }

        return fast;
    }

}
