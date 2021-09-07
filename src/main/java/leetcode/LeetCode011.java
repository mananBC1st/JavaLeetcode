package leetcode;

interface LeetCode011Solution {
    int maxArea(int[] height);
}

// link => https://leetcode-cn.com/problems/container-with-most-water/
public class LeetCode011 {

    // 暴力求解 => 运行超时
    public static class Solution implements LeetCode011Solution {

        @Override
        public int maxArea(int[] height) {
            var max = 0;
            for (int i = 0; i < height.length; ++i) {
                for (int j = i + 1; j < height.length; ++j) {
                    var area = Math.min(height[i], height[j]) * (j - i);
                    if (area > max) max = area;
                }
            }
            return max;
        }
    }

    public static class Solution2 implements LeetCode011Solution {

        @Override
        public int maxArea(int[] height) {
            var front = 0;
            var rear = height.length - 1;
            var res = 0;
            while (front < rear) {
                var h = Math.min(height[front], height[rear]);
                res = Math.max(res,  h * (rear - front));
                if (height[front] > height[rear]) rear--;
                else front++;
            }
            return res;
        }
    }
}
