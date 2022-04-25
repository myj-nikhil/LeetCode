class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int colums= mat[0].length;
        int rows = mat.length;
        System.out.println("rows = "+rows +" columns = "+colums);
        System.out.println("r= "+r+" c= "+c);
        if(r*c!=rows*colums || r==rows) return mat;
        
        int[][] newMatrix = new int[r][c];
        ArrayList<Integer> matlist= new ArrayList<>();
        
        for(int i=0; i< rows; i++){
            for(int j=0; j< colums; j++){
                matlist.add(mat[i][j]);
            }
        }
        // System.out.ln()
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
               newMatrix[i][j] = matlist.get(0);
                matlist.remove(0);
            }
        }
        
        return newMatrix;
    }
}