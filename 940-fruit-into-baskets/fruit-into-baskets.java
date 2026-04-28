class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,maxLen=0;
        int n=fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<n){
            int type=fruits[r];
            map.put(type,map.getOrDefault(type,0)+1);
            if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
            l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}