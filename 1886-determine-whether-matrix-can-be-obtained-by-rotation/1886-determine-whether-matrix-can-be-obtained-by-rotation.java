class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
         boolean ans = false;
        for (int i = 0; i < 4; i++) {
            int[][] rotatedMatrix = rotate(mat);
            mat = rotate(mat);
            boolean flag = true;
            for (int j = 0; j < rotatedMatrix.length; j++) {
                for (int j2 = 0; j2 < rotatedMatrix.length; j2++) {
                    if(rotatedMatrix[j][j2] != target[j][j2]) {
                         flag = false;
                        break;
                    }
                }
                if(!flag) break;
            }
            if(flag) return true;
            // System.out.println("adad ");
            // System.out.println(i);
        }
        return ans;
    }

    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n-1-i]=matrix[i][j]; 
            }
        }
        return rotatedMatrix;
    }
    }