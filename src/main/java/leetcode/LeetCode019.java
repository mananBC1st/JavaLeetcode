package leetcode;


interface LeetCode019Solution {
    ListNode removeNthFromEnd(ListNode head, int n);
}


public class LeetCode019 {

    public static class Solution implements LeetCode019Solution {

        @Override
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ans = head;
            ListNode ptr = head;
            while (ptr != null) {
                if (n >= 0) {
                    n--;
                } else {
                    ans = ans.next;
                }
                ptr = ptr.next;
            }
            if (ans == null) return null;
            if (ans.next == null) return null;
            if (n >= 0) return ans.next;
            ans.next = ans.next.next;
            return head;
        }
    }
}
