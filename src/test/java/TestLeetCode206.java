import leetcode.LeetCode206;
import leetcode.ListNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestLeetCode206 {

    public static void main(String... args) throws Exception {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var line = reader.readLine();
        var list = ListNode.valueOf(line, ",");
        ListNode.traverse(list);
        var sl = new LeetCode206.Solution();
        list = sl.reverseList(list);
        ListNode.traverse(list);
    }
}
