class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2){
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < n1; i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n1; i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        boolean matches = true;
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                matches = false;
                break;
            }
        }
        if (matches) return true;

        int low = 0;
        for (int high = n1; high < n2; high++) {
            arr[s2.charAt(low) - 'a']++;
            low++;
            arr[s2.charAt(high) - 'a']--;
            matches = true;
            for (int i = 0; i < 26; i++) {
                if (arr[i] != 0) {
                    matches = false;
                    break;
                }
            }
            if (matches) return true;
        }
        return false;
    }
}
