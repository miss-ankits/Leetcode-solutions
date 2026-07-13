class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length-1;
        int ind=-1;
        for(int i=n;i>0;i--){ 
            if(nums[i]>nums[i-1]){//compare from last to find the smallest number
                ind=i-1;
                break;
            }
        }
        if (ind==-1){ // if not found its the last combination,reverse to get the first
            reverse(nums,0,n);
            return ;
        }
        for(int i=n;i>ind;i--){// swap with the smallest no. from ind to n
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n);
    }

    private void reverse(int [] nums, int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    private void swap(int [] nums, int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}