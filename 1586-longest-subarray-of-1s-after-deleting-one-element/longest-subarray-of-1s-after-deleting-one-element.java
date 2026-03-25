class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,len=0,zeroes=0;
        while(r<nums.length){            
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>1){ //shrink the window
                if(nums[l]==0) zeroes--; 
                l++;
            }
            if(zeroes<=1){
                len=Math.max(len,r-l);
            }
            r++;
        }
        return len;
    }
}