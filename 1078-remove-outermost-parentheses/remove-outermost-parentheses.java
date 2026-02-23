class Solution {
    public String removeOuterParentheses(String s) {
        //int count=0; String result="";
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='('){
    //             if(count>0){
    //                 result+=s.charAt(i);
    //             }
    //             count++;
    //         }else {
    //             count--;
    //         if(count>0){
    //             result+=s.charAt(i);
    //         }
    //     }
    // }
    int count=0;
    StringBuilder sb=new StringBuilder();
    int start=0;int end=0;
    while(end<s.length()){
        if(s.charAt(end)=='('){
            count ++;
        }else count--;
        if(count==0){
            sb.append(s.substring(start+1,end));
            start=end+1;
        }
        end++;
    }
        return sb.toString();
    }
}