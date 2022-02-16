class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int rightWindowEnd = 0;
        int leftWindowBegin = 0;
        int minWindowSize = Integer.MAX_VALUE;

        for (rightWindowEnd = 0; rightWindowEnd < nums.length; rightWindowEnd++) { 
            sum += nums[rightWindowEnd];

        while (sum >= target) {
         minWindowSize = Math.min(minWindowSize, rightWindowEnd -leftWindowBegin + 1); 
                sum = sum - nums[leftWindowBegin];
                ++leftWindowBegin; 
            }

        }

        if (minWindowSize == Integer.MAX_VALUE) 
            minWindowSize = 0;

        return minWindowSize;
    }
}