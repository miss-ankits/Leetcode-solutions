class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr=new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=
        new PriorityQueue<>((a,b)-> a.getValue()-b.getValue()); //min heap
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            pq.offer(entry); //add
            if (pq.size()>k) { //keep top k frequent element in heap
                pq.poll(); //remove top element with min value
            }
        }
        for(int i=0;i<k;i++){ //output array
            arr[i]=pq.poll().getKey();
        }
        return arr;
    }
}