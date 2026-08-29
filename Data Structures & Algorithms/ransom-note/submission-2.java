class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> np = new HashMap<>();

        for(int i = 0 ; i< magazine.length();i++){
            char c = magazine.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int j = 0 ; j< ransomNote.length();j++){
            char ch = ransomNote.charAt(j);
            if (mp.get(ch)== null || mp.get(ch) == 0){
                return false;
            }
            else{
                mp.put(ch,mp.get(ch)-1);
            }
        }
        return true;
    }
}