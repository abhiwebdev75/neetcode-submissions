class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int count = 0;
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i = 0 ; i < words.length;i++){
            for(int j =0 ; j < words[i].length();j++){
                hs.put(words[i].charAt(j) , hs.getOrDefault(words[i].charAt(j),0)+1);
            }
        }
        for(char key : hs.keySet()){
            if(hs.get(key)%n != 0){
                return false;
            }
        }
        return true;
    }
}