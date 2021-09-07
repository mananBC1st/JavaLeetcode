import leetcode.LeetCode004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeetCode004Test {

    public static void sample1() {
        var sl = new LeetCode004.Solution();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            var line = bufferedReader.readLine();
            var res = sl.longestPalindrome(line);
            System.out.println(res);
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String... args) {
        sample1();
    }
}
