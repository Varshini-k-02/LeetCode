class Solution {
    public boolean isPalindrome(int num) {
       if(num < 0) return  false; 
       int rev = 0, rem, original = num;
       while(num != 0) {
            rem = num % 10; 
            rev = rev * 10 + rem; 
            num  /= 10;  
        }

        return original == rev;
        }
}