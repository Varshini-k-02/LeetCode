class Solution {
    public boolean isUgly(int n) {
       while(n>1 && n%2==0){
            n=n/2;
        }
        while(n>1 && n%3==0){
            n=n/3;
        }
        while(n>1 && n%5==0){
            n=n/5;
        }
        if(n==1)
            return true;
        return false;
    }
}