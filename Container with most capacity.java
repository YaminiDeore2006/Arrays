class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int end = height.length - 1;
        int capacity = 0 ; 

        while(start < end)
        {
            int h = Math.min(height[start], height[end]);
            int width = end - start ;
            int area = h * width ;
            capacity = Math.max(capacity,area);

            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return capacity;
    }
}
