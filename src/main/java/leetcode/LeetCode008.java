package leetcode;


//请你来实现一个myAtoi(string s)函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
//
//        函数myAtoi(string s) 的算法如下：
//
//1. 读入字符串并丢弃无用的前导空格
//2. 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
//3. 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
//4. 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
//5. 如果整数数超过 32 位有符号整数范围 [−231, 231− 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231− 1 的整数应该被固定为 231− 1 。
//返回整数作为最终结果。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/string-to-integer-atoi
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

interface LeetCode008Solution {
    int myAtoi(String s);
}

public class LeetCode008 {

    public static class Solution implements LeetCode008Solution {

        @Override
        public int myAtoi(String s) {
            var rs = s.trim(); // 去除字符串多余的空格
            var positive = true;
            var charSequence = rs.toCharArray();
            if (charSequence.length == 0) return  0;
            var cursor = 0;
            if (charSequence[cursor] == '-') {
                positive = false;
                cursor += 1;
            } else if (charSequence[cursor] == '+') {
                cursor += 1; // 忽略掉这个字符
            }
            var stringBuilder = new StringBuilder();
            if (!positive) stringBuilder.append('-');
            for (int i = cursor; i < charSequence.length; ++i)  {
                if (Character.isDigit(charSequence[i])) {
                    stringBuilder.append(charSequence[i]);
                }else {
                    break;
                }
            }
            if (stringBuilder.length() == 0) {
                return 0;
            } else if (stringBuilder.length() == 1 && stringBuilder.charAt(0) == '-') {
                return 0;
            }
            var res = 0;
            try {
                res = Integer.parseInt(stringBuilder.toString());
            }catch (NumberFormatException ex) {
                // 整形溢出的情况
                if (positive) {
                    res = Integer.MAX_VALUE;
                } else {
                    res = Integer.MIN_VALUE;
                }
            }
            return res;
        }
    }
}
