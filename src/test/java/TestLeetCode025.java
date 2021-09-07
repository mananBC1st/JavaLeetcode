import leetcode.LeetCode025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLeetCode025 {

    public static void main(String... args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            var line = reader.readLine();
            var numberString = reader.readLine();
            var number = Integer.parseInt(numberString);
            var list = TestLeetCode019.constructList(line);
            var sl = new LeetCode025.Solution();
            list = sl.reverseKGroup(list, number);
            TestLeetCode019.iteratorList(list);
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
