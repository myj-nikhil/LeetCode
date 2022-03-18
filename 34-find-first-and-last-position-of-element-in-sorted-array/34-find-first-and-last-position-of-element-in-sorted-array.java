class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }
    public int search(int[] nums, int target, boolean Isfirst){
        int start=0,end=nums.length-1,mid,ans=-1;
        while(start<=end){
           mid=start+(end-start)/2;
            if(target==nums[mid]){
                ans=mid;
                if(Isfirst) end=mid-1;
                else start=mid+1;
            }
            else if(target>nums[mid]) start=mid+1;
            else end=mid-1;
        }
        return ans;
    }
}