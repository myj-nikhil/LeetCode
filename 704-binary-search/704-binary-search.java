class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums,target,0,nums.length-1);
    }
    public int bsearch(int[] nums, int target, int start, int end) {
        if (start > end){ 
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target==nums[mid]) return mid;
        else if (target > nums[mid]) return bsearch(nums,target,mid+1,end);
        else return bsearch(nums,target,start,mid-1);
    }
}