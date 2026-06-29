class Solution {
    public int characterReplacement(String s, int k) {
        int[] f = new int[256]; 
        int n = s.length();
        int low = 0;
        int res = 0;
        int maxCount = 0;

        for(int high = 0;high<n;high++){
            char rightchar = s.charAt(high);
            f[rightchar]++;

            maxCount = Math.max(maxCount,f[rightchar]);
            int len = high - low + 1;
            int diff = len - maxCount;

            while(diff>k){
                char leftchar = s.charAt(low);
                f[leftchar]--;
                low++;

                maxCount = 0;
                for(int i = 0;i<256;i++){
                    maxCount = Math.max(maxCount,f[i]);
                }
                len = high - low +1;
                diff = len - maxCount ;
            }

            res = Math.max(res,high - low + 1); 
        }

        return res;
    }
}
