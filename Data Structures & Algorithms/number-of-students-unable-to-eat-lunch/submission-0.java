class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        int res = students.length;
        for(int i = 0; i < students.length;i++){
            count[students[i]]++;
        }
        for(int j = 0 ; j < sandwiches.length ;j++){
            if(count[sandwiches[j]]>0){
                res--;
                count[sandwiches[j]]--;
            }
            else{
                break;
            }
        }
        return res;
    }
}