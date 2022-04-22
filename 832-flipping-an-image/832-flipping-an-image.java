class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0, end = image[i].length-1;
            while(start <= end) {
                int temp = image[i][start];
                // System.out.println(temp);
                image[i][start] = image[i][end];
                // System.out.println("image"+ i+ start +"=" + image[i][start]);
                image[i][end] = temp;
                // System.out.println("image"+ i+ end +"=" + image[i][end]);
                start++;
                end--;
                // System.out.println("start = "+ start);
                // System.out.println("end = " + end);
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1; 
            }
        }

        return image;
    }
}