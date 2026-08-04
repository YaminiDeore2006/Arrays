class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // point to last valid index of nums1 means to [1,2,3,0,0,0]
        int j = n - 1; // point to last index of of num2                   i     k
        int k = m + n - 1; // nums2 = [2,5,6]
                                           j
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) { 
                nums1[k] = nums2[j];
                j--;
                k--;
            } else {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
