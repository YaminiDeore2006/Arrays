class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 , j = 0 ;
        int n = a.length ;
        int m = b.length ;
        
        while(i < n && j < m)
        {
            if(i > 0 && a[i - 1] == a[i])
            {
                i++ ;
                continue ;
            }
            
            if(j > 0 && b[j - 1] == b[j])
            {
                j++ ;
                continue ;
            }
            
            if(a[i] > b[j])
            {
                list.add(b[j]);
                j++ ;
            }
            else if(a[i] < b[j])
            {
                list.add(a[i]);
                i++;
            }
            else
            {
                list.add(a[i]);
                i++;
                j++;
            }
        }
        while(i < n)
        {
            if(i > 0 && a[i - 1] == a[i])
            {
                i++ ;
                continue ;
            }
            list.add(a[i]);
            i++ ;
        }
         while(j < m)
        {
            if(j > 0 && b[j - 1] == b[j])
            {
                j++ ;
                continue ;
            }
            list.add(b[j]);
            j++ ;
        }
        return list ;
    }
}
