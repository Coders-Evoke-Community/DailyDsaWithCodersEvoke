class Solution {
        public static int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 1;
        int max = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                k--;
            }
            if (k >= 0) {
                max = Math.max(max, j - i + 1);
            } else if (k < 0) {
                while (k < 0) {
                    if (nums[i] == 0) {
                        k++;
                    }
                    i++;
                }
            }
            j++;
        }
        return max - 1;
    }
}
