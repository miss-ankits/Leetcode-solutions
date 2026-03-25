class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,len=0,zeroes=0;
        while(r<nums.length){            
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>k){ //shrink the window
                if(nums[l]==0) { 
                zeroes--; 
                }
                l++;
            }
            if(zeroes<=k){
                len=Math.max(len,r-l+1);
            }
            r++;
        }
        return len;
    }
}