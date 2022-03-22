class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return totalWays(nums,0,target,new HashMap<String,Integer>());
    }
    public int totalWays(int[] nums, int currentIndex, int target, HashMap<String,Integer> map){
        if(currentIndex==nums.length && target==0)
            return 1;
        if(currentIndex==nums.length && target!=0)
            return 0;
        String currentKey=Integer.toString(currentIndex)+"-"+Integer.toString(target);
        if(map.containsKey(currentKey))
            return map.get(currentKey);
        int pos=totalWays(nums,currentIndex+1,target-nums[currentIndex],map);
        int neg=totalWays(nums,currentIndex+1,target+nums[currentIndex],map);
        
        map.put(currentKey,pos+neg);
        return map.get(currentKey);
    }
}
