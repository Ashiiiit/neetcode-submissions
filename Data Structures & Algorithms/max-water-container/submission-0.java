class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int n = heights.length;
        int right = n-1;
        int maxArea = Integer.MIN_VALUE;

        while(left<right){
            int  width = right - left;

            int height = Math.min(heights[left],heights[right]);

            int currArea = height * width;

            maxArea = Math.max(currArea,maxArea);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxArea;
    }
}
