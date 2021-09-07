package leetcode;

import java.util.ArrayList;

interface LeetCode025Solution {
    ListNode reverseKGroup(ListNode head, int k);
}

public class LeetCode025 {
    public static class Solution implements LeetCode025Solution {

        @Override
        public ListNode reverseKGroup(ListNode head, int k) {
            var ptr = head;
            var temp = new ArrayList<ListNode>();
            while (ptr != null) {
                var count = k;
                while (count-- > 0 && ptr != null) {
                    temp.add(ptr);
                    ptr = ptr.next;
                }
                if (count >= 0) break;
                // 反转
                var front = 0; var rear = k - 1;
                while (front < rear) {
                    var t = temp.get(front).val;
                    temp.get(front).val = temp.get(rear).val;
                    temp.get(rear).val = t;
                    front++; rear--;
                }
                temp.clear();
            }
            return head;
        }
    }
}
