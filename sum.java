class Solution {
    public int getLucky(String s, int k) {
        // Phase 1: Convert string to initial sum of digits
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        
        String numericString = sb.toString();
        int sum = 0;
        
        // Phase 2: Perform the transformation k times
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char digit : numericString.toCharArray()) {
                sum += digit - '0';
            }
            // The result becomes the input for the next transformation
            numericString = String.valueOf(sum);
        }
        
        return sum;
    }
}