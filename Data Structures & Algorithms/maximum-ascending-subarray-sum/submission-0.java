class Solution {
    public int maxAscendingSum(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0]= nums[0];
        for(int i = 1; i< nums.length;i++ ){
            if(nums[i] > nums[i-1]){
                pref[i] = pref[i-1] + nums[i];
            }
            else{
                pref[i] = nums[i];
        }
        }
        int maxx = pref[0];
        for(int i =0; i< pref.length; i++){
            if(pref[i]>maxx){
                maxx = pref[i];
            }
        }
        return maxx;
    }
}