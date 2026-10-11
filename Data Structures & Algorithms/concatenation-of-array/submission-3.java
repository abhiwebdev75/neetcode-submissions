class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] n_arr = new int[2*n];
        for(int i = 0 ; i < n; i++){
            n_arr[i]= nums[i];
            n_arr[i+n] = nums[i];
        }
    return n_arr;}
}