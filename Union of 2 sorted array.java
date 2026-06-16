class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int i = 0 , j = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i < n && j < m)
        {
            if(a[i] < b[j])
            {
                addToList(list, a[i]);
                i++;
            }
            else if(a[i] > b[j])
            {
                addToList(list, b[j]);
                j++;
            }
            else
            {
                addToList(list, a[i]);
                i++ ;
                j++ ;
            }
        }
        
        while(i < n)
        {
            addToList(list,a[i]);
            i++;
        }
        
        while(j < m)
        {
            addToList(list,b[j]);
            j++;
        }
        
        return list;
    }
    public static void addToList(ArrayList<Integer> list,int ele)
    {
        if(list.isEmpty() || list.get(list.size() - 1) != ele)
        {
            list.add(ele);
        }
    }
}
