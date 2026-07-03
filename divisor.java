class Solution {
    public int findGCD(int[] nums) {
        int minVal = 1001;
        int maxVal = 0;
    
        for (int num : nums) {
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }
        
        return gcd(maxVal, minVal);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}