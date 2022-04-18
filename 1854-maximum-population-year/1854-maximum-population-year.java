class Solution {
    public int maximumPopulation(int[][] logs) {
        int ans=0;
        int[] popuArray = new int[200];
        // System.out.println(Arrays.toString(popuArray));
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                popuArray[j-1950]++;
            }
        }
        // System.out.println(Arrays.toString(popuArray));
        int max = 0;
        // int maxindex = 0;
        for (int i=0 ; i<popuArray.length;i++) {
            if (popuArray[i] > max) {
                max = popuArray[i];
                ans = i+1950; 
            }
        }
        
        return ans; 
    }
}