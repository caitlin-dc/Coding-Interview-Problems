class Solution {
    public int kthFactor(int n, int k) {
       
        LinkedList<Integer> factors = new LinkedList<Integer>();

        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                factors.add(i);
                System.out.println(factors);
            } 
        }

        factors.add(n);
        System.out.print(factors);
        return (k-1) < factors.size() ? factors.get(k-1) : -1;
    }
}