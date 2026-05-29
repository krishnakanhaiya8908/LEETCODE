class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num=new int[m];
        for(int i=0;i<m;i++){
            num[i]=nums1[i];
        }
        int[] arr=new int[num.length+nums2.length];
        for(int i=0; i<m; i++){
            arr[i] = num[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        for(int i=0; i<arr.length; i++){
            nums1[i] = arr[i];
            }
        Arrays.sort(nums1);
        
        
    }
}