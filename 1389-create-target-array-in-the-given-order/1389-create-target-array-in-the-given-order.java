class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                 target[i]= -1;   
            }
        for(int i=0;i<nums.length;i++){
             if (target[index[i]] == -1){
                target[index[i]] = nums[i];
            }else{
                // Shifting
                for (int j = index[i] + 1; j < nums.length; j++){
                    int temp = target[j];
                    target[j] = target[index[i]];
                    target[index[i]] = temp;
                }
                target[index[i]] = nums[i];
            }
            }
        
        return target;
    }
}