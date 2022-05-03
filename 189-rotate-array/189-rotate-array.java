class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n<=1){}
        else{
            if(k>n) k=k%n;
        int[] a = new int[n];
        for(int i=0;i<k;i++) {
            a[i]=nums[n-k+i];
        }
        int j=0;
        for(int i=k;i<n;i++) {
            a[i]=nums[j];
            j++;
        }
        for(int i=0;i<n;i++) {
            nums[i]=a[i];
        }
        }
}
}