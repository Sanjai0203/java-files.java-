class Solution {
    public int minimumChairs(String s) {
        int currentPeople = 0;
        int maxPeople = 0;
        
        for (char event : s.toCharArray()) {
            if (event == 'E') {
                currentPeople++;
            } else if (event == 'L') {
                currentPeople--;
            }
            
            
            if (currentPeople > maxPeople) {
                maxPeople = currentPeople;
            }
        }
        
        return maxPeople;
    }
}