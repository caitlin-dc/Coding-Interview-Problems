class Solution {
    public String mergeAlternately(String word1, String word2) {
       
        if (word1.isEmpty()){
            return word2; 
        }
        else if (word2.isEmpty()) {
            return word1;
        }

        String word = "";
        if (word1.length() >= word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                if (i >= word2.length()) {
                    word += word1.charAt(i);
                }
                else {
                    word += word1.charAt(i);
                    word += word2.charAt(i);
                }
            }
        }
        else {
            for (int i = 0; i < word2.length(); i++){
                if (i >= word1.length()) {
                    word += word2.charAt(i);
                }
                else {
                    word += word1.charAt(i);
                    word += word2.charAt(i);
                }
            }
        }
        return word;
    }
}