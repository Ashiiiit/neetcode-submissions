class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Set<Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }

        int streak = 0;
        for(int num:numset){
            if(!numset.contains(num-1)){
                int currentNum = num;
                int currstreak = 1;

                while(numset.contains(currentNum+1)){
                    currentNum++;
                    currstreak++;
                }
                streak = Math.max(streak,currstreak);
            }

        }
        return streak;
    }
}
