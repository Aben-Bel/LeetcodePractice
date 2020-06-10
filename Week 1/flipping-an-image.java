// Author: Abenezer Sleshi Belay
// https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i<A.length; i++) {
            for(int j = 0; j<A[i].length; j++) {
                if(j >= A[i].length/2){
                    if((A[i].length & 1) == 1){
                        A[i][j] = A[i][j] == 0 ? 1 : 0;
                    }
                    break;
                }
                
                
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = temp;
                A[i][j] = A[i][j] == 0 ? 1 : 0;
                A[i][A[i].length - j - 1] = A[i][A[i].length - j -1] == 0 ? 1 : 0;
                
            }
        }
        return A; 
    }
}