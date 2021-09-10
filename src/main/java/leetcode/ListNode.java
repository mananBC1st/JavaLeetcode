package leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 从字符串构造List
    public static ListNode valueOf(String str, String regex) {
        if (str.isEmpty() || str.isBlank()) return null;
        String[] content = str.split(regex);
        ListNode head = new ListNode(), ptr = head;
        int i = 0;
        for (; i < content.length - 1; ++i) {
            ptr.val = Integer.parseInt(content[i]);
            ptr.next = new ListNode();
            ptr = ptr.next;
        }
        ptr.val = Integer.parseInt(content[i]);
        return head;
    }

    public static void traverse(ListNode list) {
        while (list != null) {
            System.out.printf("%d -> ", list.val);
            list = list.next;
        }
        System.out.print("null\n");
    }
}

