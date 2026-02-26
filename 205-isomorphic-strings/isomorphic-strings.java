class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        //Map<Character,Character> map=new HashMap<>();
        int [] hash1=new int[256];
        int [] hash2=new int[256];
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
                if(hash1[sc]!= hash2[tc]){
                return false;
                }
        hash1[sc]=i+1;
        hash2[tc]=i+1;
    }
    return true;
    }
}
