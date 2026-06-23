class Solution {
    public String largestEven(String s) {
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                continue;
            }
            else{
                String result=s.substring(0,i+1);
                return result;
            }
        }
        return "";
    }
}