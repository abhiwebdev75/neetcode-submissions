class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
       for(int l = 0 ; l < s.length();l++){
        for(int r = s.length()-1;r > l; r--){
            if(s.charAt(l)==s.charAt(r)){
                max = Math.max(r-l-1,max);
            }
        }
       }
       return max;
    }
}