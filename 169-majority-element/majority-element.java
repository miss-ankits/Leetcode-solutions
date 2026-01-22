class Solution {
    public int majorityElement(int[] nums) {
         int n=nums.length;
    //     Map<Integer,Integer> map=new HashMap<>();
    //     for(int num:nums){
    //         map.put(num,map.getOrDefault(num,0)+1);
    //     }
        
    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //         if(entry.getValue()>n/2){
    //             return entry.getKey();
    //         }

    //     }
    //     return -1;
    // }
    int el=0;
    int count=0;
    for(int i=0;i<n;i++){
        if(count==0){
            el=nums[i];
            count++;
        }else if(nums[i]==el){
            count++;
        }
        else{
            count--;
        }
    }
    return el;
    }
}