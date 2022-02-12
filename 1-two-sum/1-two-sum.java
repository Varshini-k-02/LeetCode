class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            int requiredNum = target - numbers[i];
            if(hm.containsKey(requiredNum)){
                int toReturn[] = {hm.get(requiredNum), i};
                return toReturn;
            }

            hm.put(numbers[i], i);
        }
        return null;
    }
}
