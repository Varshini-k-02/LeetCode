class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(common)){
                common = common.substring(0,common.length()-1);
            }
        }
        return common;
    }
}