class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans= new ArrayList<>();
        for(int i= left;i<=right;i++)
        {
            int n = i;
            boolean flag= true;
            while(n>0){
                int dig=n%10;
                if(dig==0||i%dig!=0){
                    flag=false;
                    break;
              

                }
                n=n/10;

            }
            if(flag){
                ans.add(i);   

            }
                 
        }
        return ans;
    }
}