class Solution {
    public int removeElement(int[] nums, int val) {
         int tot = nums.length;
        for (int i = 0; i < tot; i++) {
            if (nums[i] == val) {
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