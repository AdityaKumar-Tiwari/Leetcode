class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0; // Josephus problem
        for(int i = 1; i<=n ; i++){
            winner = (winner+k) % i;
        }
        return winner +1; //convert it into 0-based index to 1-based index by adding 1 as friends are fron 1 to n.
    }
}