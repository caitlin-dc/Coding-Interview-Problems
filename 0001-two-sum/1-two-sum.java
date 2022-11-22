class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            temp[0] = nums[i];
            for (int j = 1; j < nums.length; j++) {
                temp[1] = nums[j];
                if (temp[0] + temp[1] == target && i != j) {
                    int[] indices = {i, j};
                    return indices;
                }
            }
        }
        return null;
    }
}