class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlength = 0;
        int currlength = 0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                currlength++;
                maxlength = Math.max(maxlength,currlength);
            }
            else{
                currlength =0 ;
            }

        }
        return maxlength;
        
    }
}