class Solution {
    public int minDeletionSize(String[] arr) {
        int x=arr[0].length();
        int res=0;
        for(int c=0;c<x;c++){
            for(int r=1;r<arr.length;r++){
                if(arr[r].charAt(c)<arr[r-1].charAt(c)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
