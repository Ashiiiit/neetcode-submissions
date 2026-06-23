class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = (row*col)-1;

        while(left<=right){
            int mid = left + (right-left)/ 2;
        
            int midval = matrix[mid/col][mid%col];

            if(midval == target){
                return true;
            }
            else if(midval > target){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        
        }
        return false;
    }
}
