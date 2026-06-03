class Solution {
    public int[] twoSum(int[] nums, int target) {
        return helper(nums,target,0,1);
    }
    private int[] helper(int[] nums,int target, int left, int right){
        if(left>= nums.length){
            return new int[]{};

        }
        if(right>=nums.length){
            return helper(nums,target,left+1,left+2);
        }
        if(nums[left]+nums[right]==target){
            return new int[] {left,right};
        }

        return helper(nums,target,left,right+1);
    }

}
