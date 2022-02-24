class Solution {
    public int scoreOfParentheses(String s) {
        int ans = 0, balance = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
                if (s.charAt(i-1) == '(')
                    ans += 1 << balance;
            }
        }

        return ans;
    }
}