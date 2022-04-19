class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posCount++;
            }
        }
        int negCount=nums.length-posCount;
        int pos[]=new int[posCount];
        int neg[]=new int[negCount];
        int pIndex=0,nIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[pIndex]=nums[i];
                pIndex++;
            }
            else{
                neg[nIndex]=nums[i];
                nIndex++;
            }
        }
        int res[]=new int[nums.length];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0 && i<nums.length){
                res[i]=neg[n];
                n++;
                
            }
            else{
                res[i]=pos[p];
                p++;
            }
        }
        return res;
    }
}