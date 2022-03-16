class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddSum = 0, res = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 1;
        for (int num : nums) {
            oddSum += num & 1;
            sum[oddSum]++;
            if (oddSum >= k) {
                res += sum[oddSum - k];
            }
        }
        return res;
    }
}

