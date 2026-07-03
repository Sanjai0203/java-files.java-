class Solution {
    public boolean judgeCircle(String m) {
        int row=0,col=0;
        for(int i=0;i<m.length();i++){
            char ch=m.charAt(i);
            if(ch=='U') row--;
            else if(ch=='D') row++;
            else if(ch=='L') col--;
            else if(ch=='R') col++;
        
        }
        if(row==0&&col==0) return true;
        return false;

        }
    }
