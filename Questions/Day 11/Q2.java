class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;

        for (int val : weights) {
            sum += val;
            max = Math.max(max, val);
        }

        int low = max;
        int high = sum;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] weights, int days, int mid) {
        int d = 1;
        int sum = 0;

        for (int i = 0; i < weights.length; ++i) {
            sum += weights[i];

            if (sum > mid) {
                d++;
                sum = weights[i];
            }
        }
        return d <= days;
    }
}
