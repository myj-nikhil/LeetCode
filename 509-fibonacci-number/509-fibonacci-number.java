class Solution {
    public int fib(int n) {
        if (n==0 || n==1) return n;
        int[] fibarray = new int[n+1];
            fibarray[0]=0;
            fibarray[1]=1;
        for(int i=2; i<n+1; i++) {
            fibarray[i]=fibarray[i-1]+fibarray[i-2];
        }
        return fibarray[n];
    }
}