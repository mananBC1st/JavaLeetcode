import leetcode.LeetCode013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeetCode013 {


    public static void main(String... args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            var line = reader.readLine();
            var sl = new LeetCode013.Solution();
            var res = sl.romanToInt(line);
            System.out.println(res);
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
