class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i = 0 ; i < nums1.length; i++){
            hs.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length; i++){
            hs2.add(nums2[i]);
        }
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
       for (int num : hs) {
    if (!hs2.contains(num)) {
        n1.add(num);
    }
}

for (int num : hs2) {
    if (!hs.contains(num)) {
        n2.add(num);
    }
}
        res.add(n1);
        res.add(n2);
        return res;
    }
}