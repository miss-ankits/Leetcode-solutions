class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null) return "";
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0]; //first element
        String last= strs[strs.length-1]; //last element
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){ //compare char for prefix
                return sb.toString();
            }
                sb.append(first.charAt(i));
            }
            return sb.toString();
        }
        
    }