import leetcode.LeetCode017;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestLeetCode017 {

    public static void main(String... args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            var line = reader.readLine();
            var sl = new LeetCode017.Solution();
            var res = sl.letterCombinations(line);
            System.out.println(res);
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (Exception ignored) {}
        }
    }
}
