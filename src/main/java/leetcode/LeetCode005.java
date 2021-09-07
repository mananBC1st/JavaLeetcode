package leetcode;


import java.util.Vector;

interface LeetCode005Solution {
    String convert(String s, int numRows);
}

//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
//比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/zigzag-conversion
public class LeetCode005 {

    public static class Solution implements LeetCode005Solution {

        @Override
        public String convert(String s, int numRows) {
            Vector<Vector<Character>> matrix = new Vector<>();
            // 初始化字符矩阵
            for (int i = 0; i < numRows; ++i) matrix.add(new Vector<>());

            int verticalPtr = 0,  head = 0, len = s.length(), cnt = 0;
            char[] chars = s.toCharArray();
            while (cnt < len) {
                matrix.get(verticalPtr).add(chars[cnt++]);
                if (head == 0) verticalPtr++; // 代表朝下走
                if (head == 1) verticalPtr--;
                if (verticalPtr == numRows) {
                    // Z字形走位走到底部了
                    verticalPtr = Math.max(numRows - 2, 0);
                    head = 1; // 朝上走
                }
                if (verticalPtr <= 0) {
                    // Z 走到顶部了
                    verticalPtr = 0;
                    head = 0; // 朝下走
                }
            }
            StringBuilder builder = new StringBuilder();
            for (Vector<Character> characterVector : matrix) {
                for (Character character : characterVector) {
                    builder.append(character);
                }
            }
            return builder.toString();
        }
    }
}
