class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int index=0;
        
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans.add(index++,i);
            }
        }
        int[] res = new int[ans.size()];
        for(int j=0;j<ans.size();j++){
            res[j]=ans.get(j);
        }
        if(ans.size()==0){
            return new int[]{-1,-1};
        }
        return new int[]{res[0],res[ans.size()-1]};
    }
}