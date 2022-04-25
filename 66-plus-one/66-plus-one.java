class Solution {
    public int[] plusOne(int[] a) {
        int n = a.length;
        int carry =1;
        int[] newa = new int[n+1];
        for(int i=0;i<n;i++) {
            if(a[n-1-i]+carry < 10) {
                a[n-1-i] +=1;
                // System.out.println("i = " +i);
                return a;
            }
            else{
                a[n-1-i]=a[n-1-i] +carry-10;
            }
        }
        if(a[0]==0){
            newa[0]=1;
            for(int i=1;i<n+1;i++) {
                newa[i]=a[i-1];
            }
            return newa;
        }
        return a;
    }
}