class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,count=0;
        for(int j=0;j<t.length();j++){
            if(i<s.length() && t.charAt(j)==s.charAt(i)){
                i++;
                count++;
            }
        }
        if(count==s.length()){
            return true;
        }
        return false;
    }
}