class Solution {
    public boolean isPerfectSquare(int n) {
        if(n==1)
            return true;
        long start=0,end=n/2;
        while(start<=end){
            long mid=start +(end-start)/2;
            if(mid*mid < n){
                start=mid+1;
            }
            else if(mid*mid>n){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}

