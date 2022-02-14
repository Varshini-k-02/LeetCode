//Brute force TC : O(N+M)
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

//Optimized TC : O(NlogN)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
        
    }
    int search(int[] nums,int target,boolean firstStartIndex){
        int ans=-1; 
         
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstStartIndex==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
