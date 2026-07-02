class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        
        
        int max = sum;
        
        
        for (int i = k; i < a.length; i++) {
            sum = sum + a[i] - a[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        return (double) max / k;
    }
}