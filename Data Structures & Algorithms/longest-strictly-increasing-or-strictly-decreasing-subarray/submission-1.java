class Solution {
    public int longestMonotonicSubarray(int[] nums) {
     int sum=1;
    int count=1;
    int max=1;
        for(int i=1;i<nums.length;i++){
          if(nums[i]>nums[i-1]){
            sum++;
            count=1;
          }else if(nums[i]<nums[i-1]){
            count++;
            sum=1;
          }else{
            sum=1;
            count=1;
          }
        if(sum>max){
            max=sum;
        }if(count>max){
            max=count;
        }
        }
        return max;
    }
}