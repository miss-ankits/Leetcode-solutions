class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0,r=0,l=0,maxLen=0;
        int n=nums.length;
        while(r<n){
        if(nums[r]==0){
            zeroes++;
        }
        if(zeroes>k){
            if(nums[l]==0){
            zeroes--;
            }
            l++;
        }
        maxLen=Math.max(maxLen,r-l+1);
        r++;
    }
    return maxLen;
}
}