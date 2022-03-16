class Solution {
    public int tribonacci(int n) {
        return triFibo(n,new HashMap<Integer,Integer>());
    }
    public static int triFibo(int n,HashMap<Integer,Integer> map){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int currentKey=n;
        if(map.containsKey(n)){
            return map.get(currentKey);
        }
        int a=triFibo(n-1,map);
        int b=triFibo(n-2,map);
        int c=triFibo(n-3,map);
        map.put(currentKey,a+b+c);
        return map.get(currentKey);
    }
}