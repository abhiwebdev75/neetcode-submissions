class Solution {
    public int maxDifference(String s) {

        HashMap<Character, Integer> hs = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        // Find maximum odd frequency and minimum even frequency
        for (int freq : hs.values()) {

            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }

        return maxOdd - minEven;
    }
}