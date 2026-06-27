class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
            continue; 
            }
        
        int low = i+1;
        int high = n-1;
        int sum = (-1)*nums[i];

        while(low<high){
            int s = nums[low]+nums[high];
            if(s==sum){
                result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
                while(low<high && nums[high]==nums[high+1]){
                    high--;
                }
            }
            else if(s<sum){
                low++;
            }
            else{
                high--;
            }
        }
        }
        return result;
    }
}
