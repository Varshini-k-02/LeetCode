class Solution {
    public boolean canPartition(int[] nums) {
        HashMap<String,Boolean> map = new HashMap<>();
        int tot=0;
        for(int x:nums){
            tot+=x;
        }
        if(tot%2!=0)
            return false;
        return isPossible(nums,0,tot/2,map);
    }
    static boolean isPossible(int[] nums,int currentIndex,int ts, HashMap<String,Boolean> map){
        if(ts==0){
            return true;
        }
        if(currentIndex>=nums.length){
            return false;
        }
        String currentKey=Integer.toString(currentIndex)+"-"+Integer.toString(ts);
        if(map.containsKey(currentKey))
            return map.get(currentKey);
        boolean consider=false;
        if(nums[currentIndex]<=ts)
            consider=isPossible(nums,currentIndex+1,ts-nums[currentIndex],map);
        if(consider){
            map.put(currentKey,true);
            return true;
        }
        boolean notConsider=isPossible(nums,currentIndex+1,ts,map);
        map.put(currentKey,consider || notConsider);
        return consider || notConsider;
    }
}