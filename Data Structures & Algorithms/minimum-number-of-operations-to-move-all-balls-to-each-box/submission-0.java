class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int res[] = new int[n];
        int ball = 0;
        int moves =0;
        for(int i = 0 ; i < n ; i++){
            res[i]= ball + moves;
            moves += ball;
            ball += boxes.charAt(i) - '0';
        }
        ball = moves = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            res[i] += ball + moves;
            moves += ball;
            ball += boxes.charAt(i) - '0';
        }
        return res;
    }
}