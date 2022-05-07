class Solution {
    public boolean isPowerOfThree(int n) {
        long i = 1;
        while(i<n){
            i = i*3;
        }
        return i == n;
    }
}
 