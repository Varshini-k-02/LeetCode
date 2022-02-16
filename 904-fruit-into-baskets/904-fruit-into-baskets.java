class Solution {
    public int totalFruit(int[] fruits) {
         int startWindow = 0, maxLength = 0;
        Map<Integer,Integer> fruitFrequencyMap = new HashMap<>();
        for(int endWindow = 0; endWindow < fruits.length; endWindow++){
            fruitFrequencyMap.put(fruits[endWindow], fruitFrequencyMap.getOrDefault(fruits[endWindow],0)+1);
            
            while(fruitFrequencyMap.size() > 2){
                fruitFrequencyMap.put(fruits[startWindow],fruitFrequencyMap.get(fruits[startWindow])-1);
                if(fruitFrequencyMap.get(fruits[startWindow]) == 0){
                    fruitFrequencyMap.remove(fruits[startWindow]);
                }
                startWindow++;
            }
            maxLength = Math.max(maxLength,endWindow - startWindow + 1);                                   
        }
        return maxLength;
    }
}