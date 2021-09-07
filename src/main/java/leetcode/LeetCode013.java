package leetcode;

interface LeetCode013Solution {
    int romanToInt(String s);
}

public class LeetCode013 {

    public static class Solution implements LeetCode013Solution {

        @Override
        public int romanToInt(String s) {
            var res = 0;
            var chars = s.toCharArray();
            char prev = '\0';
            for (int i = chars.length - 1; i >= 0; --i) {

                switch (chars[i]) {
                    case 'I':
                        if (prev == 'V' || prev == 'X') {
                            res -= 1;
                        } else {
                            res += 1;
                        }
                        prev = 'I';
                        break;
                    case 'V':
                        res += 5;
                        prev = 'V';
                        break;
                    case 'X':
                        if (prev == 'L' || prev == 'C') {
                            res -= 10;
                        } else {
                            res += 10;
                        }
                        prev = 'X';
                        break;
                    case 'L':
                        res += 50;
                        prev = 'L';
                        break;
                    case 'C':
                        if (prev == 'D' || prev == 'M') {
                            res -= 100;
                        } else {
                            res += 100;
                        }
                        prev = 'C';
                        break;
                    case 'D':
                        res += 500;
                        prev = 'D';
                        break;
                    case 'M':
                        res += 1000;
                        prev = 'M';
                        break;
                    default:break;


                }
            }
            return res;
        }
    }
}
