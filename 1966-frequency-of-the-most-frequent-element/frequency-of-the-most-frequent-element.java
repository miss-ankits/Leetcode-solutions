class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total=0; long res=0;
        int left=0;int right=0;
        while(right<nums.length){
            total+=nums[right];
            while(nums[right]*(right-left+1L)>total+k){ 
                //largest element in the window * size> total sum+k;
                total-=nums[left];
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return (int) res;

    }
}