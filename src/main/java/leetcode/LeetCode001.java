package leetcode;


import java.util.Hashtable;

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
//链接：https://leetcode-cn.com/problems/two-sum/
interface LeetCode001Solution {
    int[] twoSum(int[] nums, int target);
}

public class LeetCode001 {

    public static class Solution1 implements LeetCode001Solution {

        @Override
        public int[] twoSum(int[] nums, int target) {
            // 暴力求解
            // 定义两个指针，一前一后
            int former = 1, latter = 0;
            if (nums.length < 2) return new int[0];
            int[] result = new int[2];
            while (latter < nums.length - 1) {
                int ans = target - nums[latter];
                // 从剩下的序列里寻找
                while (former < nums.length) {
                    if (ans - nums[former] == 0) {
                        result[0] = latter;
                        result[1] = former;
                        return result;
                    }
                    former++;
                }
                latter++; former = latter + 1;
            }
            return result;
        }
    }

    // 第二种解法，空间换时间
    public static class Solution2 implements LeetCode001Solution {

        @Override
        public int[] twoSum(int[] nums, int target) {
            var table = new Hashtable<Integer, Integer>();
            for (var i = 0; i < nums.length; ++i) {
                int ans = target - nums[i];
                if (table.containsKey(nums[i])) {
                    var idx = table.get(nums[i]);
                    return new int[] {Math.min(i, idx), Math.max(i, idx)};
                }
                table.put(ans, i);
            }
            return new int[0];
        }
    }
}
