class Solution {

    public int countCharacters(String[] words, String chars) {

        int[] ch = new int[26];
        int res = 0;

        // Count characters in chars
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            ch[c - 'a']++;
        }

        // Check every word
        for (String word : words) {

            // Make a copy for this word
            int[] temp = ch.clone();

            boolean possible = true;

            for (int j = 0; j < word.length(); j++) {

                char c = word.charAt(j);

                if (temp[c - 'a'] == 0) {
                    possible = false;
                    break;
                }

                temp[c - 'a']--;
            }

            if (possible) {
                res += word.length();
            }
        }

        return res;
    }
}