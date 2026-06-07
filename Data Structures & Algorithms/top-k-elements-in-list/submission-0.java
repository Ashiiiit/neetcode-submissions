class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> mp = new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        List <Integer> lst = new ArrayList<>(mp.keySet());

        Collections.sort(lst, (a,b) -> mp.get(b)-mp.get(a));

        int index = 0;
        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[index] = lst.get(i);
            index++;
        }
        return result;
    }
}
