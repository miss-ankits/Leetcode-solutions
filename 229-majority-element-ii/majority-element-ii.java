class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int el1=0;int count1=0;int count2=0; int el2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1){
                count1++;

            }else if(nums[i]==el2){
                count2++;
                
            }
            else if(count1==0){
                el1=nums[i];
                count1++;
            }
            else if(count2==0){
                el2=nums[i];
                count2++;
            }
            else {
            count1--;
            count2--;
            }
        }
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) {count1++;}
            else if(nums[i]==el2) {count2++;}
        }
        if(count1>nums.length/3)
        list.add(el1);
        if(count2>nums.length/3)
        list.add(el2);
    return list;
}
}