class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         List<Integer> lucky = new ArrayList<>();
       
        for (int i = 0; i < matrix.length; i++) {
            int minrow = 0;
            int minrowel = matrix[i][0];
             //finding min in each row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minrowel) {
                    minrowel = matrix[i][j];
                    minrow = j;
                }
            }
            // System.out.println(minrowel);
            // System.out.println(minrow);
            int maxcolel = matrix[0][minrow];   
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][minrow]> maxcolel ) maxcolel = matrix[j][minrow];
            }
            // System.out.println(maxcolel);
            if (minrowel == maxcolel) lucky.add(minrowel);
        }
        return lucky;
    }
}