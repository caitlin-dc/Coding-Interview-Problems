class Solution {
    //Checks if the String is a valid palindrome with the option to remove one char
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
          //So far, is a palindrome
          if (s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
          }
          else {
            //Delete either the left or the right character
            return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
          }
        }
        return true;
    }

    //Universal Palindrome Checker
    private boolean isPalindrome(String s, int left, int right) {
      while (left <= right) {
        if (s.charAt(left) == s.charAt(right)) {
          left++;
          right--;
        }
        else {
          return false;
        }
      }
      return true;
    }
}
