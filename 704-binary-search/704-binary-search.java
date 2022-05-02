class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int start =0,end=nums.length-1;
        while(start<=end){
            mid = start +(end-start)/2;
            if(target==nums[mid]) return mid;
            else if (target>nums[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}