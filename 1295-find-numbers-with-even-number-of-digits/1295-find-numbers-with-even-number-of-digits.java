class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
                for (int i : nums) {
                    ans += isEvenNoofDigits(i) ? 1 : 0; 
                    }
                return ans;
    }
    
    public static boolean isEvenNoofDigits(int num) {
                int count=0;
                while(num != 0) {
                    count += 1;
                    num /= 10;
                }
                return count % 2 == 0;
            }
}