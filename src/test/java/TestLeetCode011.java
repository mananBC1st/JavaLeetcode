import leetcode.LeetCode011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeetCode011 {

    public static void main(String... args) {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            var content = reader.readLine().split(" ");
            var input = new int[content.length];
            for (int i = 0; i < content.length; ++i) { input[i] = Integer.parseInt(content[i]);}
            var sl = new LeetCode011.Solution2();
            var res = sl.maxArea(input);
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
