class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0,totFuel=0,totCost=0,start=0;
        for(int i=0;i<gas.length;i++){
            totFuel+=gas[i];
            totCost+=cost[i];
        }
        //When the below condition fails we won't be able to reach the starting station
        if(totFuel<totCost){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                start=i+1;
                curr=0;
            }
        }
        return start;
    }
}
