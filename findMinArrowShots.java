class Solution {
    public int findMinArrowShots(int[][] arr){
        Arrays.sort(arr,(a,b)-> Integer.compare(a[1],b[1]));
        // Initially assume the arrows that are needed as 1
        int arrows=1;
        int prev=0;
        for(int curr=1;curr<arr.length;curr++){
            //If curr balloon overlaps the interval of prev balloon, then we need extra arrows
            if(arr[curr][0]>arr[prev][1]){
                arrows++;
                prev=curr;
            }
        }
        return arrows;
    }
}
