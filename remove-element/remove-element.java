class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        boolean noVal = true;
        for(int i=0;i<n;i++){
            if(nums[i]==val) {
                nums[i]=51;
                noVal = false;
            }
        }
        if(noVal) return n;
        else {
            Arrays.sort(nums);
        int i=0;
            while(nums[i]!=51){
            i++;
        }
            return i;
        }
    }
}