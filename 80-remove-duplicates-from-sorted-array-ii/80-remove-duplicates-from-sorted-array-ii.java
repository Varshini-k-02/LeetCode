class Solution {
    public int removeDuplicates(int[] nums) {
        int index=2;
        int n=nums.length;
        if(n<2){
            return n;
        }
        for(int i=2;i<n;i++){
            if(nums[index-2]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
     return index;   
    }
}
