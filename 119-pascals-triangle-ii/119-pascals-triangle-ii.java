class Solution {
    public List<Integer> getRow(int rowIndex) {
        int i = rowIndex;
        long val = 1;
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<=i;j++)
        {
            ans.add((int)val);
            val = val*(i-j)/(j+1);
        }
        return ans;
    }
}