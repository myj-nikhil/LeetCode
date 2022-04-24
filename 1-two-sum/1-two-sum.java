class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length-1; i++){
            int goal = target - nums[i];
            for(int j=i+1; j<nums.length;j++){
                if (nums[j]==goal) {
                    ans[0]=i;
                    ans[1]=j;
                    
                }
                 if(ans[0]==1 && ans[1]!=i) {
                    ans[0]=i;
                     return ans;
                }
            }
        }
        return ans;
    }
}