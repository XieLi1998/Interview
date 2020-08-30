package 高频;

/**
 * Created by xieli on 2020/8/30.
 */
public class reverseList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //206，反转简单链表
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    //92，反转部分链表
    public ListNode reverseBetween(ListNode head, int m, int n) {
        return null;
    }

}
