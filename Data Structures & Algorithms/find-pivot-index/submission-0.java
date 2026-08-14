class Solution {
    public int pivotIndex(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        pref[0] = 0;
        suff[nums.length-1] = 0;
        for(int i = 1; i < nums.length;i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        for(int j = nums.length - 2; j >= 0 ;j--){
            suff[j] = suff[j+1] + nums[j+1];
        }
        for(int k = 0; k < nums.length; k++){
            if(pref[k] == suff[k]){
                return k;
            }
        }
    return -1;
    }
}