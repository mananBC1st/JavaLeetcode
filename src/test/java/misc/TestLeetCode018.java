package misc;

import leetcode.LeetCode018;
import leetcode.ListNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestLeetCode018 {

    public static void main(String... args) throws Exception {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var line = reader.readLine();
        var targetString = reader.readLine();
        var content = line.split(",");
        var nums = new int[content.length];
        for (var i = 0; i < content.length; ++i) {
            nums[i] = Integer.parseInt(content[i]);
        }
        var sl = new LeetCode018.Solution();
        var res = sl.fourSum(nums, Integer.parseInt(targetString));
        for (var l : res) {
            System.out.println(l);
        }
    }
}
