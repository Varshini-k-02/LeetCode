

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) 
            return nums[0];
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr1[] =new int[nums.length-1];
        int arr2[] =new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i+1];
        }
        int a = maxMoney(arr1,0,map);
        HashMap<Integer, Integer> map1=new HashMap<>();
        int b=maxMoney(arr2,0,map1);
        return Math.max(a,b);
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
        return Math.max(rob,noRob);
    }
}