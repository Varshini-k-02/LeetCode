class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        int n = costs.length;
        int answer = 0;
        
        while (answer < n && costs[answer] <= coins) {
            
            coins -= costs[answer];
            answer += 1;
        }
        return answer;
    }
}
