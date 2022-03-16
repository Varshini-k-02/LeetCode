class Solution {
    public int rob(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return maxMoney(nums,0,map);
    }
    public static int maxMoney(int[]nums, int currentHouse, HashMap<Integer,Integer> map){
        if(currentHouse>=nums.length){
            return 0;
        }
        int currentKey=currentHouse;
        if(map.containsKey(currentKey)){
            return map.get(currentKey);
        }
        int rob=nums[currentHouse]+maxMoney(nums,currentHouse+2,map);
        int noRob=maxMoney(nums,currentHouse+1,map);
        
        map.put(currentKey,Math.max(rob,noRob));
        return map.get(currentKey);
    }
}