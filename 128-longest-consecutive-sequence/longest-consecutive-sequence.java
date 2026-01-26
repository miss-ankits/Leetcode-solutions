class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int number=i;
                int count=1;
                while(set.contains(number+1)){
                    number+=1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}