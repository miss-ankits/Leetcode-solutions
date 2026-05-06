class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0,l=0,r=0,maxFreq=0;
        Map<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            char right=s.charAt(r);
            map.put(right,map.getOrDefault(right,0)+1);
            maxFreq=Math.max(maxFreq,map.get(right));
            if(r-l+1-maxFreq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}