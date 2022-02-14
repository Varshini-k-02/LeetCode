class Solution {
    public int removeDuplicates(int[] nums) {
        int tot = nums.length;
        for (int i = 0; i < tot; i++) {
            if (i<tot-1 && nums[i] == nums[i+1]) {
                shift(nums, i + 1);
                i--;
                tot--;
            }
        }
        return tot;
    }
    public void shift(int[] arr, int n) {
        for (int i = n; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
    }
}