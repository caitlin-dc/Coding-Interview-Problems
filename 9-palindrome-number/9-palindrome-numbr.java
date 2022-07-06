class Solution {
    public boolean isPalindrome(int x) {
        //Negative numbers cannot be palindrome.
        if (x < 0) {
            return false;
        }
        int temp = 0, remainder = 0, oldX = x;
        while (x != 0) {
            remainder = x % 10;           //The last digit in x, each time.
            temp = temp * 10 + remainder; //By multiply by ten, ensure place is changed.
            x = x / 10;                   //Move x over to the next place, until 0.
        }
        return oldX == temp;
    }
}
