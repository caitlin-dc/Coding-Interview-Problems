class Solution {
    public boolean isPalindrome(int x) {
        /*Negative and even numbers cannot be palindromes.
        if (x < 0 || x / 2 == 0) {
            return false;
        }*/
        String temp = "";
        String num = Integer.toString(x);
        //Traverses through number, adding last digit to temp.
        for (int i = 1; i <= num.length(); i++) {
            temp += num.charAt(num.length() - i);
        }
        if (num.equals(temp)) {
            return true;
        }
    return false;  
    }
}