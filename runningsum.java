class Solution {
    public int[] runningSum(int[] nums) {
        // Start from index 1 because the first element 
        // doesn't have a previous element to add.
        for (int i = 1; i < nums.length; i++) {
            // Update the current element by adding the previous running sum
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}