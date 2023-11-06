class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } 

        // Find the GCD of both string lengths
        int gcd = 0;
        for (int i = str2.length(); i >= 0; i--) {
            System.out.println(str1.length() % i);
            System.out.println(str2.length() % i);
            if ((str1.length() % i == 0) && (str2.length() % i == 0)) {
                gcd = i;
                break;
            }
        }
        String x = "";
        if (gcd >= 1) {
            x = str2.substring(0,gcd);
        }
        return x;
    }
}
