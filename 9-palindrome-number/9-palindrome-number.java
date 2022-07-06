class Solution {
    public boolean isPalindrome(int x) {
        String temp = "";
        String num = Integer.toString(x);
        for (int i = 1; i <= num.length(); i++) {
            temp += num.charAt(num.length() - i);
        }
        if (num.equals(temp)) {
            return true;
        }
    return false;  
    }
}