public class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int a = 0 ; a < heights.length; a++ ){
            expected[a]= heights[a];
        }
        Arrays.sort(expected);

        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                res++;
            }
        }

        return res;
    }
}