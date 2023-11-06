class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> mostCandies = new ArrayList<Boolean>();

        for (int candy: candies) {
            if (candy + extraCandies >= max) {
                mostCandies.add(true);
            }
            else { 
                mostCandies.add(false);
            }
        }
        return mostCandies;
    }
}
