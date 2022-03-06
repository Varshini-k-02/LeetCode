class Solution {
    public List<String> cellsInRange(String s) {
        String[] a=s.split(":");
        char c1=a[0].charAt(0);
        char c2=a[1].charAt(0);
        char r1=a[0].charAt(1);
        char r2=a[1].charAt(1);
                            
        List<String> ans = new ArrayList<>();
        for(char c=c1;c<=c2;c++){
            for(char r = r1;r<=r2;r++){
                ans.add(""+c+r);
            }
        }
      return ans;
    }
}