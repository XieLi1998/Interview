package 笔试;

/**
 * Created by xieli on 2020/10/25.
 */
public class 水滴 {
    private static class ListNode {
        int val;
        ListNode next;

        void setVal(int x) {
            val = x;
        }
    }


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList(head.next);
            newHead.next.next = newHead;
            newHead.next = null;
            return newHead;
        }
    }

    public void reversePairs(int[] nums) {
    }

}
