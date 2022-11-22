//AUTHOR: Caitlin DeShazo-Couchot
//November 11, 2022

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[strs.length - 1]; 
        int start = strs.length - 1;
        for (int i = start; i >= 0; i--) {
            if (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                i = start;
            }
        }
        return prefix;
    }
}