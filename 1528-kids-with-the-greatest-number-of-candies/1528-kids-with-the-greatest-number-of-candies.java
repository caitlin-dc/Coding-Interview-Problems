class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> mostCandies = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                mostCandies.add(i, true);
            }
            else {
                mostCandies.add(i, false);
            }
        }
        return mostCandies;
    }
}