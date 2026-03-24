class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int n=s.length();
        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left); //keeps window from moving backward
            }
            map.put(s.charAt(right),right); //if not present in map and update if present
            length=Math.max(length,right-left+1); //length of longest substring
            right++;
        }
        return length;
    }

}