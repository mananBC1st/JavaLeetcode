package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface LeetCode018Solution {
    List<List<Integer>> fourSum(int[] nums, int target);
}

public class LeetCode018 {


    // 回溯法超时
    // 回溯法本质上是一种暴力的算法，并不是最优的算法
    public static class Solution implements LeetCode018Solution {

        private final List<List<Integer>> res = new ArrayList<>();

        private void doSearch(int[] nums, int start, int target, List<Integer> container) {

            if (target == 0 && container.size() == 4){
                res.add(new ArrayList<>(container));
                return;
            }
            if (container.size() == 4) return;

            for (int i = start; i < nums.length; ++i) {
                container.add(nums[i]);
                doSearch(nums, i + 1, target - nums[i], container);
                // 回溯
                container.remove(container.size() - 1);
                while (i < nums.length - 1 && nums[i] == nums[i+1]) i++;//  去重
            }
        }

        @Override
        public List<List<Integer>> fourSum(int[] nums, int target) {
            if (nums.length < 4) return res;
            Arrays.sort(nums);
            doSearch(nums, 0, target, new ArrayList<>());
            return res;
        }
    }
}
