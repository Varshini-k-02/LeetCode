class Solution {
    public int minimumRounds(int[] tasks) {
        int n=tasks.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(tasks[i])){
                int x=map.get(tasks[i]);
                map.put(tasks[i],x+1);
            }
            else{
                map.put(tasks[i],1);
            }
        }
        int result = 0;

        for (int count : map.values()) {
            if (count == 1) 
                return -1;

            result += count / 3;
            if(count % 3 != 0) 
                result++;

    }
    return result;
}
}
