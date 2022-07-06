class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        //Uses recursion to get previous and next previous Fibonacci terms.
        return fib(n-1) + fib(n-2);
    }
}