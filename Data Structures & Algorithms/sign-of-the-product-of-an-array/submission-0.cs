public class Solution {
    public int ArraySign(int[] nums) {
        int NegCount = 0;
        int Zero = 0;
        for(int i = 0 ; i < nums.Length;i++){
            if(nums[i]<0){
                NegCount++;
            }
            else if(nums[i]==0){
                return 0;
            }
            else{
                continue;
            }
        }
        if(NegCount%2==0){
            return 1;
        }
        else{
            return -1;
        }
    }
}