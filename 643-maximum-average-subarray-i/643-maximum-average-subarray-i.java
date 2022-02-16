class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i;
        double windSum=0,maxSum=0,windAvg=0,maxAvg=0;
        for(i=0;i<k;i++){
            windSum+=nums[i];
        }
        windAvg=windSum/(double)k;
        maxAvg=windAvg;
        for(i=k;i<n;i++){
            windSum+=nums[i]-nums[i-k];
            maxAvg=Math.max(maxAvg,windSum/(double)k);
        }
        return maxAvg;
    }
}