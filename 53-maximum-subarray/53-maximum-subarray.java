class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
        int maxval=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            if(sum<0){
                maxval=Math.max(maxval,sum);
                sum=0;
            }
            else{
                maxval=Math.max(maxval,sum);
            }
        }
        return maxval;
    }
}