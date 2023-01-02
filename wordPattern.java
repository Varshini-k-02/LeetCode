class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> char = new HashMap<>();
        Map<String, Character> word = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!char.containsKey(c)) {
                char.put(c, w);
            }

            if (!word.containsKey(word)) {
                word.put(w, c);
            }

            if (!char.get(c).equals(w) || !word.get(w).equals(c)) {
                return false;
            }
        }

        return true;        
    }
}
