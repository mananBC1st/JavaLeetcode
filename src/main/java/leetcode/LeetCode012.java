package leetcode;

import java.util.Stack;

interface LeetCode012Solution {
    String intToRoman(int num);
}
public class LeetCode012 {

    public static class Solution implements LeetCode012Solution {

        @Override
        public String intToRoman(int num) {
            var stack = new Stack<Character>();
            // 1 10 100 1000
            var bitSymbol = new char[] {'I', 'X', 'C', 'M'};
            // 5 50 500
            var assistantBitSymbol = new char[] {'V', 'L', 'D'};

            var bit = 0;
            for(;;) {
                var bitNumber = num % 10;
                var symbol = bitSymbol[bit];

                if (bitNumber < 4) {
                  for (int i = 0; i < bitNumber; ++i) { stack.push(symbol); }
                } else if (bitNumber == 4) {
                    stack.push(assistantBitSymbol[bit]);
                    stack.push(symbol);
                } else if (bitNumber < 9) {
                    for (int i = 0; i < bitNumber - 5; ++i) {
                        stack.push(symbol);
                    }
                    stack.push(assistantBitSymbol[bit]);
                } else {
                    stack.push(bitSymbol[bit + 1]);
                    stack.push(symbol);
                }
                bit++;
                if (num / 10 != 0) {
                    num /= 10;
                }else {
                    break;
                }
            }
            var stringBuilder = new StringBuilder();
            while (!stack.isEmpty()) { stringBuilder.append(stack.pop()); }
            return stringBuilder.toString();
        }
    }
}
