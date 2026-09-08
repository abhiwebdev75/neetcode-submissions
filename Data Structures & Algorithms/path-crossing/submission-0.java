class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        int x =0;
        int y = 0;
        visited.add(x+","+y);

        for(char c : path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='E') x++;
            else if(c=='W') x--;
            String res = x+","+y;
            if(visited.contains(res))return true;
            visited.add(res);
        }
    return false;
    }
}