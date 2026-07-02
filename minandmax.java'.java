class
    public long minMaxSubarraySum(int[] nums, int k) {
        return getSum(nums, k, true) + getSum(nums, k, false);
    }

    private long getSum(int[] nums, int k, boolean isMin) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && (isMin ? nums[j] >= nums[i] : nums[j] <= nums[i])) {
                j = left[j] - 1;
            }
            left[i] = j + 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            int j = i + 1;
            while (j < n && (isMin ? nums[j] > nums[i] : nums[j] < nums[i])) {
                j = right[j] + 1;
            }
            right[i] = j - 1;
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            long l = i - left[i] + 1;
            long r = right[i] - i + 1;
            
            total += (long) nums[i] * countSubarrays(l, r, k);
        }
        return total;
    }

    private long countSubarrays(long l, long r, int k) {
        
        long count = 0;
        for (long i = 1; i <= l; i++) {
            count += Math.min(r, (long) k - i + 1);
        }
        return count;
    }
}