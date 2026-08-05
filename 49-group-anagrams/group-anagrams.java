class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s: strs){
            char[] arr=s.toCharArray(); //[ate,..,..] -> [a,t,e]
            Arrays.sort(arr); //sort each string of the array by char
            String key=new String(arr);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>()); //new list to add string of same group
        }
        map.get(key).add(s);
        }
        return new ArrayList<>(map.values()); 
    }
}