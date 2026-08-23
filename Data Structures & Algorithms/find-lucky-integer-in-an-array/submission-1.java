class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int max = -1;
        for(int  j= 0 ; j < arr.length;j++){
            int temp = mp.get(arr[j]);
            if(arr[j]==temp){
                max = arr[j];
            }
        }
        return max;
    }
}