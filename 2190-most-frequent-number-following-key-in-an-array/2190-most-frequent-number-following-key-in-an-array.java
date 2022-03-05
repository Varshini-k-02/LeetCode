class Solution {
    public int mostFrequent(int[] nums, int key) {
       Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == key) {
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0) + 1);
            }
        }
        
        int result = Integer.MAX_VALUE;
        int count = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > count) {
                result = entry.getKey();
                count = entry.getValue();
            }
        }
        
        return result;
    }
}