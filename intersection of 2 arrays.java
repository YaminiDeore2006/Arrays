class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1)
        {
            set.add(i);
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums2)
        {
            if(set.contains(i))
            {
                ans.add(i);
            }
        }
        int index = 0 ;
        int[] result = new int[ans.size()];
        for(int i : ans)
        {
            result[index++] = i ;
        }
        return result ;
    }
}
