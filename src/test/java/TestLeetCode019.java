
import leetcode.LeetCode019;
import leetcode.ListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestLeetCode019 {

    public static ListNode constructList(String line) {
        var content = line.split(",");
        ListNode head = new ListNode();
        var ptr = head;
        var collection = Arrays.stream(content).map(Integer::parseInt).collect(Collectors.toList());
        var i = 0;
        for (; i < collection.size() - 1; ++i) {
            ptr.val = collection.get(i);
            ptr.next = new ListNode();
            ptr = ptr.next;
        }
        ptr.val = collection.get(i);

        return head;
    }

    public static void iteratorList(ListNode list) {
        while (list != null) {
            System.out.printf("%d -> ", list.val);
            list = list.next;
        }
        System.out.printf("null\n");

    }

    public static void main(String... args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            var line = reader.readLine();
            var numberString = reader.readLine();
            var target = Integer.parseInt(numberString);
            var list = constructList(line);
            iteratorList(list);
            var sl = new LeetCode019.Solution();
            list = sl.removeNthFromEnd(list, target);
            iteratorList(list);
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException ignored) {}
        }
    }
}
