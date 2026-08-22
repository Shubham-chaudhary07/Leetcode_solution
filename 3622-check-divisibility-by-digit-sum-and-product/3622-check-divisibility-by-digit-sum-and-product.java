class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int sum=0;
        int org=n;

        while(n!=0){
            int rem=n%10;
            prod*=rem;
            sum+=rem;
            n=n/10;
        }
        int t=sum+prod;
        if(org%t==0 && t!=0){
            
            return true;
        }
        return false;

    }
}