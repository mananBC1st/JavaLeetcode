import leetcode.LeetCode012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeetCode012 {

    public static void main(String... args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            var line = reader.readLine();
            var sl = new LeetCode012.Solution();
            var res = sl.intToRoman(Integer.parseInt(line));
            System.out.println(res);
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            reader.close();
        }
    }
}
