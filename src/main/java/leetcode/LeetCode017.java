package leetcode;

import java.util.ArrayList;
import java.util.List;

interface LeetCode017Solution {
    List<String> letterCombinations(String digits);
}

public class LeetCode017 {


    public static class Solution implements LeetCode017Solution {

        private final StringBuilder buffer = new StringBuilder();
        private final List<String> res = new ArrayList<>();

        public void backtracking(String digits, String[] number, int level) {
            if (level == digits.length()) {
                res.add(buffer.toString());
                return;
            }
            var temp = number[digits.charAt(level) - '0'];
            for (var i = 0; i < temp.length(); ++i) {
                buffer.append(temp.charAt(i));
                // 递归下一层
                backtracking(digits, number, level + 1);
                // 回溯
                buffer.deleteCharAt(buffer.length() - 1);
            }
        }

        @Override
        public List<String> letterCombinations(String digits) {
            if (digits.isEmpty()) return res;
            var number = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            backtracking(digits, number, 0);
            return res;
        }
    }
}
