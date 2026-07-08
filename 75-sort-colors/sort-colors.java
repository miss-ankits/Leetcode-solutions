class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int start=0;
        int mid=0; //keep mid moving and swap acc to start and end i.e, 0 and 1
        int end=n-1;
        while(mid<=end){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[start];
                nums[start]=temp;
                mid++;start++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
    }
}