class Solution {
    public String reverseVowels(String s) {
        String vowels = "";

        // First, find the vowels
        for (int i = 0; i < s.length(); i++) {
            if (checkV(s.charAt(i))) {
                vowels += s.charAt(i);
            }
        }

        // Second, traverse the string backwards and replace all vowels
        char[] sArr = s.toCharArray();
        int vowelsIndex = vowels.length() - 1;

        for (int i = 0; i < sArr.length; i++) {
            if (checkV(sArr[i])) {
                sArr[i] = vowels.charAt(vowelsIndex);
                vowelsIndex--;
            }
        }
        
        // Convert char array back to string
        return new String(sArr);
    }

    private boolean checkV(char x) {
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'
                || x == 'A' || x == 'E' || x == 'I' ||  x == 'O' || x == 'U');
    }
}
