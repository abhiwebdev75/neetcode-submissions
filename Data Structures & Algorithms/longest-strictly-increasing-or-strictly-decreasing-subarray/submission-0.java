class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res =0;
        int increasing =0;
        int decreasing =0;
        int in =0;;
        int dec =0;
        for(int i =1; i< nums.length;i++){
            if(nums[i]>nums[i-1]){
                in++;
                decreasing =Math.max(dec,decreasing);
                increasing =Math.max(in,increasing);
                dec =0;
                continue;
            }
            if(nums[i]<nums[i-1]){
                dec++;
                decreasing =Math.max(dec,decreasing);
                increasing =Math.max(in,increasing);
                in=0;
                
            }
            if(nums[i]==nums[i-1]){
                decreasing =Math.max(dec,decreasing);
                increasing =Math.max(in,increasing);
                in =0;
                dec =0;
            }
        }
        return(Math.max(increasing,decreasing)+1);
    }
}