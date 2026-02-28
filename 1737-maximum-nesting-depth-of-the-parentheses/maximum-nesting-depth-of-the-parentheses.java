class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                st.pop();
            }
            count=Math.max(count,st.size());
        }
        return count;
    }
}