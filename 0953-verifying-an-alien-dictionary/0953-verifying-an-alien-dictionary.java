class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        // Make Alien Alphabet
        Map<Character, Integer> alien = makeAlphabet(order);

        // Goes through all words in words
        for (int i = 0; i < words.length - 1; i++) {
            if (!check(words[i], words[i+1], alien)) {
                return false;
            }
        }
        return true;
    }

    //Checks the lexicological order of the two words
    private boolean check(String s1, String s2, Map<Character, Integer> alien) {
            
            // Goes through all letters shortest of two words
            for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {

                // Check if the character doesn't exist in the word or if it's out of bounds
                if (alien.get(s1.charAt(i)) > alien.get(s2.charAt(i))) {
                    return false;
                }

                else if (alien.get(s1.charAt(i)) < alien.get(s2.charAt(i))) {
                    return true;
                }
            }

            // If second word is shorter than the first and it's a prefix, then returns false
            if (s2.length() < s1.length()) {
                    return false;
            }
        return true;
    }
    
    // Make alphabet lexicological order by making character the key and index the value.
    private Map<Character, Integer> makeAlphabet(String s) {
        
        Map<Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            alphabet.put(s.charAt(i), i);
        }
        return alphabet;
    }
}

