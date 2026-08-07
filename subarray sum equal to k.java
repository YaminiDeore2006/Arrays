class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int prefSum = 0 ;

        for(int i = 0; i < nums.length; i++)
        {
            prefSum += nums[i];

            if(prefSum == k)
            {
                res++;
            }

            if(map.containsKey(prefSum - k))
            {
                res += map.get(prefSum - k) ;
            }

            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return res ;
    }
}
