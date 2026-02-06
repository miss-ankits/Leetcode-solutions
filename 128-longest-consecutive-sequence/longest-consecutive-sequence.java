class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        if(nums.length==0) return 0;
        int x=0;
        int longest=1;
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                x=i;
                int count=1;
                while(set.contains(x+1)){
                    x=x+1;
                    count=count+1;
                }
                longest=Math.max(longest,count);
            }
           
        }
        return longest;
}
}