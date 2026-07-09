class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            } 
            sum+=nums[i];
            max=Math.max(sum,max);
        }
        return max;
        //follow up question:solve it in divide and conquer way
    //take start end and pivot index(middle),
    //start counting the max sum from pivot to start and pivot+1 to end,
    //add both to find max subarray sum
    }
}