class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = 1;
        int y = n;

        while (y != 2*n - 1) {
            int temp = nums[y];
            
            for (int i = y; i > x; i--) {
                nums[i] = nums[i - 1];
            }
            nums[x] = temp;
            x += 2;
            y++;
        }
        return nums;
    }
}
