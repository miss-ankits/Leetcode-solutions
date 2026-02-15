class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int k=m+n-1; //start of 0
        while(left>=0 && right>=0){
            if(nums1[left]>nums2[right]){
                nums1[k]=nums1[left];
                left--;
            }else{
                nums1[k]=nums2[right]; //put nums2 in nums1 in sorted way
                right--;
            }
            k--;
        }
        while(right>=0){ //put leftover nums2 array elements in nums1 array
            nums1[k]=nums2[right];
            k--;
            right--;
        }
        // for(int i=0;i<n;i++){
        //     nums1[m+i]=nums2[i];
        // }
        // Arrays.sort(nums1);
    }
}