class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int[] arr = new int[256];
        
        int res= 0;

        for(int high=0;high<n;high++){
            int rightChar = s.charAt(high);
            arr[rightChar]++;

            while(arr[rightChar]>1){
                    char leftChar = s.charAt(low); 
                arr[leftChar]--;
                    low++;
            }
            
            res = Math.max(res,high-low+1);
    }        
    return res;
    }
}
