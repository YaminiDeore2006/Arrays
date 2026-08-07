class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        
        int res = 0 ;
        int prefSum = 0 ;
        
        for(int i = 0; i < arr.length ;i++)
        {
            prefSum += arr[i] ;
            
            if(prefSum == k)
            {
                res = i + 1 ;
            }
            if(map.containsKey(prefSum - k))
            {
                res = Math.max(res, i - map.get(prefSum - k));
            }
            if(!map.containsKey(prefSum))
            {
                map.put(prefSum, i);
            }
        }
        return res ;
    }
}
