class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0,l=0,r=0,maxFreq=0;
        int n=s.length();
        int freq[]= new int[26];
        while(r<n){
            freq[s.charAt(r)-'A']++;
            //maxFreq=len of subarray-k;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            //window size-maxFreq letter>k
            if(r-l+1-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}