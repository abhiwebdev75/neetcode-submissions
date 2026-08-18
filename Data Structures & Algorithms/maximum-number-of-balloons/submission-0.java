class Solution {
    public int maxNumberOfBalloons(String text) {
      HashMap<Character,Integer> mp = new HashMap<>();
      for(int i = 0; i<text.length(); i++){
        mp.put(text.charAt(i),mp.getOrDefault(text.charAt(i),0)+1);
      }
      int res = 0;
      while (mp.getOrDefault('b', 0) >= 1 &&
       mp.getOrDefault('a', 0) >= 1 &&
       mp.getOrDefault('l', 0) >= 2 &&
       mp.getOrDefault('o', 0) >= 2 &&
       mp.getOrDefault('n', 0) >= 1){
        res++;
        mp.put('b',mp.get('b')-1);
        mp.put('a',mp.get('a')-1);
        mp.put('l',mp.get('l')-2);
        mp.put('o',mp.get('o')-2);
        mp.put('n',mp.get('n')-1);
      }
      return res;
    }
}