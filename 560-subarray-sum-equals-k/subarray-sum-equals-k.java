class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int presum=0;
        Map<Integer,Integer> map=new HashMap<>(nums.length);
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            int res=presum-k;
            if(map.containsKey(res)){
            count+=map.get(res);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}