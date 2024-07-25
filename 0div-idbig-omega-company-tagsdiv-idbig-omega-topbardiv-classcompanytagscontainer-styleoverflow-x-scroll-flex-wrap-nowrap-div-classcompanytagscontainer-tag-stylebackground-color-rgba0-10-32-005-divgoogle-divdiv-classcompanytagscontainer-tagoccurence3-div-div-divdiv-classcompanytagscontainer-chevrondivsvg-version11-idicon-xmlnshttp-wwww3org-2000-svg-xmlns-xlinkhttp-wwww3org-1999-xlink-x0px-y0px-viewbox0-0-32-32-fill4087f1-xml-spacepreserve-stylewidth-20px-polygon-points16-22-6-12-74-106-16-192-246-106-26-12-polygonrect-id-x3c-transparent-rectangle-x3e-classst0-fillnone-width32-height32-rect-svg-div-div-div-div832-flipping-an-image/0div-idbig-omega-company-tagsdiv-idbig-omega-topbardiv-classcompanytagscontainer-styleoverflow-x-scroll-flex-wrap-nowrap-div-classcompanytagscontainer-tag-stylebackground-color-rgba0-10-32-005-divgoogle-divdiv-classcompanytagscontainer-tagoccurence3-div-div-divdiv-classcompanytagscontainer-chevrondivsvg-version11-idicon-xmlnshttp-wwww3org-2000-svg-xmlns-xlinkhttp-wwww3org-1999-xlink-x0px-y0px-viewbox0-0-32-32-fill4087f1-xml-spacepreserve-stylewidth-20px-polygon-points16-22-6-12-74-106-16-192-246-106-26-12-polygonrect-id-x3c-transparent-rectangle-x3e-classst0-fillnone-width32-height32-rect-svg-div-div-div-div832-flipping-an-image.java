class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int[] row : image) {
 // reverse array & image[0].length it is col which than div by 2 to get the middle element
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap & perform XOR
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}