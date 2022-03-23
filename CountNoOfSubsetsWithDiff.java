public static int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int val : nums)
            totalSum += val;
        target = (totalSum - target) / 2;
        return findTarget(nums, target, 0, new HashMap<>());
    }

    private static int findTarget(int[] nums, int target, int currIndex, HashMap<String, Integer> map) {
        if (target == 0)
            return 1; 
        if (currIndex >= nums.length) return 0;
        String key = currIndex + "-" + target;
        
        if (map.containsKey(key))
            return map.get(key);
        
        int pick = 0;
        
        if (nums[currIndex] <= target) pick = findTarget(nums, target - nums[currIndex], currIndex + 1, map);
        int notPick = findTarget(nums, target, currIndex + 1, map);
        map.put(key, pick + notPick);
        
        return map.get(key);
    }
