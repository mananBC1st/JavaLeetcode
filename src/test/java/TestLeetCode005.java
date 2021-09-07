import leetcode.LeetCode005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeetCode005 {


    public static void main(String... args) {
        var sl = new LeetCode005.Solution();
        var reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            var input = reader.readLine();
            var rows = reader.readLine();
            var res = sl.convert(input, Integer.parseInt(rows));
            System.out.println(res);
        }catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (IOException ignored) {}
        }

    }
}
