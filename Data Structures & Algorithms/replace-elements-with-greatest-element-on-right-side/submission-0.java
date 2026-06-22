class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int large = 0;
            for(int j=i+1;j<n;j++){
                if(arr[j]>=large){
                    large = arr[j];
                    
                }
            }
            arr[i] = large;
            
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}