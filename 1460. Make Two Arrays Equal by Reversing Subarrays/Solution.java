class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int N = target.length;
        Map<Integer, Integer> hm_a = new HashMap<>();
        Map<Integer, Integer> hm_b = new HashMap<>();

        for (int i = 0; i < N; i++) {
            hm_a.put(target[i], hm_a.getOrDefault(target[i], 0) + 1);
            hm_b.put(arr[i], hm_b.getOrDefault(arr[i], 0) + 1);
        }

        // Check if both arrays have the same elements with the same frequencies
        return hm_a.equals(hm_b);
    }
}
