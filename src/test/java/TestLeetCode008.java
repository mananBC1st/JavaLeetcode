import leetcode.LeetCode008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeetCode008 {


    public static void main(String... args) {
        try {
            var reader = new BufferedReader(new InputStreamReader(System.in));
            for(;;) {
                var number = reader.readLine();
                var sl = new LeetCode008.Solution();
                var res = sl.myAtoi(number);
                System.out.println(res);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
