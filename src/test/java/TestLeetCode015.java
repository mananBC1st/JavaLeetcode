import leetcode.LeetCode015;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestLeetCode015 {

    public static void main(String... args) {

        var reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            var line = reader.readLine();
            var content = line.split(",");
            var nums = new int[content.length];
            for (var i = 0; i < content.length; ++i) {
                nums[i] = Integer.parseInt(content[i]);
            }
            var sl = new LeetCode015.Solution();
            var res = sl.threeSum(nums);
            for (var r : res) {
                System.out.println(r);
            }

        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (Exception ignored){}
        }
    }
}
