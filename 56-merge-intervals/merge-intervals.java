class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<List<Integer>> list=new ArrayList<>();
        for(int[] interval:intervals){
            if(list.isEmpty() || list.get(list.size()-1).get(1)<interval[0]){
                list.add(Arrays.asList(interval[0],interval[1]));
            }else{
                int last=list.size()-1;
                int max=Math.max(list.get(last).get(1),interval[1]);
                list.get(last).set(1,max);
            }
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i).get(0);
            result[i][1] = list.get(i).get(1);
        }

        return result;
    }
}