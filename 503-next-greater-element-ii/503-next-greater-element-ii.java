class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n*2;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                arr[stack.pop()]=nums[i%n];
            }
            stack.push(i%n);
        }
        return arr;
    }
}