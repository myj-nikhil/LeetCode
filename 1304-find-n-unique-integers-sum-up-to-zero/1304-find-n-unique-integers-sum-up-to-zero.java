    class Solution {
    public int[] sumZero(int n) {
        int[] zeroArray = new int[n];
        if(n==1) zeroArray[0] = 0;
        else {
            zeroArray[0] = 1;
            int mid = (int)Math.floor(zeroArray.length/2);
            // System.out.println(mid);
            for (int i = 1; i < mid; i++) {
                zeroArray[i] = zeroArray[i-1] + 1;
            }
            if (n % 2 != 0) {
                for (int i = mid+1 ; i < zeroArray.length; i++) {
                    zeroArray[i] = - zeroArray[i-mid-1];
                }
            }
            else {
                for (int i = mid; i < zeroArray.length; i++) {
                    zeroArray[i] = - zeroArray[i-mid];
                }
            }
        }
        return zeroArray;
    }
}