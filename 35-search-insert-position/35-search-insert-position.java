class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[n-1]){
            return n;
        }
        if(n==1){
            return 0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
                // if(s==e && nums[mid]>target){
                //     return s+1;
                // }
            }
            else if(nums[mid]<target){
                s=mid+1;
                // if(s==e && nums[mid]<target){
                //     return s+1;
                // }
            }   
        }
        return s;
    }
}