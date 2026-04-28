class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,maxLen=0;
        int n=fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<n){
            int type=fruits[r];
            map.put(type,map.getOrDefault(type,0)+1);
            if(map.size()>2){
                int left=fruits[l];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
            l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}