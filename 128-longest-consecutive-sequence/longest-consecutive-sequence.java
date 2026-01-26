class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
        set.add(num);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int number=i;
                int count=1;
                while(set.contains(number+1)){
                    number+=1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}