class Solution {
    public static int prod(int n){
        int prods=1;
        while(n!=0){
            int rem=n%10;
            prods=prods*rem;
            n=n/10;
        }
        return prods;
    }
    public int smallestNumber(int n, int t) {

        while(true){
           int ns= prod(n);
            if(ns%t==0){
                return n;
            }
            n++;
        }
        
    }
}