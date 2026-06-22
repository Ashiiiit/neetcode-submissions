class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int n = nums.length;
        int[] left= new int[n]; 
        int[] right= new int[n];
        for(int i=0;i<n;i++){
            left[i] = leftsum ;
            leftsum += nums[i];
        }
        for(int i=n-1;i>=0;i--){
            right[i] = rightsum ;
            rightsum += nums[i];
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
            return i;
        }
        }
        
        return -1;
    }
}