class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        int result = numBottles;
        while(numExchange <= total){
            total -= numExchange;
            total++;
            numExchange++;
            result++;
        }
        return result;
    }
}