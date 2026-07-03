class Solution {
    public int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int maxAlt = 0;
        
        for (int g : gain) {
            currentAlt += g;
        
            if (currentAlt > maxAlt) {
                maxAlt = currentAlt;
            }
        }
        
        return maxAlt;
    }
}