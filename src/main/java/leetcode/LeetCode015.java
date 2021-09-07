package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface LeetCode015Solution {
    List<List<Integer>> threeSum(int[] nums);
}

public class LeetCode015 {

    public static class Solution implements LeetCode015Solution {

        @Override
        public List<List<Integer>> threeSum(int[] nums) {
            var res = new ArrayList<List<Integer>>();
            if (nums.length < 3) return res;
            // 对数组进行排序
            Arrays.sort(nums);
            if (nums[0] > 0) return res;
            boolean b = Arrays.stream(nums).allMatch(it -> it == 0);
            if (b){
                res.add(List.of(0, 0, 0));
                return res;
            }
            for (int front = 0; front < nums.length; ++front) {
                if (front > 0 && nums[front] == nums[front - 1]) continue;
                var mid = front + 1;
                var rear = nums.length - 1;
                while (mid < rear) {
                    var sum = nums[front] + nums[rear] + nums[mid];
                    if (sum > 0)  {
                         rear --;
                    } else if (sum < 0) {
                        mid++;
                    } else {
                        res.add(List.of(nums[front], nums[mid], nums[rear]));
                        while (mid < rear && nums[mid] == nums[mid + 1]) mid++;
                        while (mid < rear && nums[rear] == nums[rear- 1]) rear--;
                        mid++; rear--;
                    }
                }
            }
            return res;
        }
    }
}
