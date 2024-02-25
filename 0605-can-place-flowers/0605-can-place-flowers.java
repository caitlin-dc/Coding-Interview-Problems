import java.util.Arrays;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            
            //Checks if there is no flower and we are either at the beginning, 
            //there is no flower before it, or that are are at the end and there is a blank spot after this.
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == len - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
