class Solution {
    public int convertTime(String current, String correct) {
        String[] curr = current.split(":");
        String[] corr = correct.split(":");
        int cur = Integer.parseInt(curr[0]) * 60 + Integer.parseInt(curr[1]);
        int cor = Integer.parseInt(corr[0]) * 60 + Integer.parseInt(corr[1]);
        int count = 0;
        
        while(cur + 60 <= cor) {
            ++count;
            cur += 60;
        }
        
         while(cur + 15 <= cor) {
            ++count;
            cur += 15;
        }
        
         while(cur + 5 <= cor) {
            ++count;
            cur += 5;
        }
        
         while(cur + 1 <= cor) {
            ++count;
            cur += 1;
        }
        
        return count;
  } 
        
}
