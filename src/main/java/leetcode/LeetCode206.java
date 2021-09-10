package leetcode;

interface LeetCode206Solution {
    ListNode reverseList(ListNode head);
}
public class LeetCode206 {

    public static class Solution implements LeetCode206Solution {

        @Override
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            ListNode prev = null, cur = head, next = null;
            while (cur != null) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            return  prev;
        }
    }
}
