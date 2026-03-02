class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] hash=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                hash[ch-'a']++; //increase freq count
                int maxFreq=Integer.MIN_VALUE;
                int minFreq=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(hash[k]>0){
                        maxFreq=Math.max(maxFreq,hash[k]);
                        minFreq=Math.min(minFreq,hash[k]);
                    }
                }
                ans+=(maxFreq-minFreq);
            }
        }
        return ans;
    }
}