class Solution {
    public int maxProductDifference(int[] nums) {
        int mx1 = 0;
        int mx2 = 0;
        int mn1 = 10001;
        int mn2 = 10001;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]>=mx1){
                mx2 = mx1;
                mx1 = nums[i];
            }
            else if(nums[i]>=mx2){
                mx2 = nums[i];
            }
            if(nums[i]<=mn1){
                mn2 = mn1;
                mn1 = nums[i];
            }
            else if(nums[i]<=mn2){
                mn2 = nums[i];
            }
        }
        System.out.print(mx2);
        return (mx1 * mx2)-(mn1 * mn2);
    }
}