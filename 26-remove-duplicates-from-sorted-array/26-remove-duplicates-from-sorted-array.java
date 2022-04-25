class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int i=0;
        int k=0;
        if(nums.length==1) return 1;
        while(nums[i]<nums[nums.length-1]){
             j=i+1;
            while(nums[j] <= nums[i]){
                j++;
            }
            nums[i+1] = nums[j];
            i++;
            // System.out.println(Arrays.toString(nums));
        }
        // System.out.println("i = "+i);
        // System.out.println("j = "+j);
        if(i+1<nums.length) nums[i+1]=nums[j];
        for(k=0;k<nums.length-1;k++){
            if(nums[k+1]<=nums[k]) break;
        }
        return k+1;
    }
}