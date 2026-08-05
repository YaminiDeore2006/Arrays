class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i = 1; i <= arr.length; i++)
        {
            if(map.containsKey(i))
            {
                list.add(map.get(i));
            }
            else
            {
                list.add(0);
            }
        }
        return list ;
    }
}
