class Solution {
    public int fib(int n) {
        return fibo(n,new HashMap<Integer,Integer>());
    }
    public static int fibo(int n,HashMap<Integer,Integer> memo){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int ck=n;
        if(memo.containsKey(n))
            return memo.get(ck);
        int a=fibo(n-1,memo);
        int b=fibo(n-2,memo);
        memo.put(ck,a+b);
        return memo.get(ck);
    }
}