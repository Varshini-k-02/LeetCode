class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> subList = new ArrayList<>();
            int one = 1;
            for(int j=0;j<=i;j++){
                subList.add(one);
                one = one*(i-j)/(j+1);
            }
            ans.add(subList);
        }
        return ans;
    }
}