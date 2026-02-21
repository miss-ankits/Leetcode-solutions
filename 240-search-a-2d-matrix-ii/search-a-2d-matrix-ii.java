class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;int high=matrix[0].length-1;
        while(low<m && high>=0){
            if(matrix[low][high]==target) return true;
            else if(matrix[low][high]>target){
                high--;
            }else low++;
        }
        return false;
    }
}