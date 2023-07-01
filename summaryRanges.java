class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<Integer> front=new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        int start=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=n-1 && (nums[i+1]-nums[i])!=1){
                front.add(start);
                last.add(i);
                start=i+1;
            }
            if(i==n-2 && (nums[i+1]-nums[i])==1){
                front.add(start);
                last.add(i+1);
            }
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<front.size();i++){
            if(front.get(i)!=last.get(i)){
                ans.add(nums[front.get(i)]+"->"+nums[last.get(i)]);
            }
            else{
                ans.add(nums[front.get(i)]+"");
            }
        }
        if(start==n-1){
                ans.add(nums[n-1]+"");
            }
        return ans;
    }
}
