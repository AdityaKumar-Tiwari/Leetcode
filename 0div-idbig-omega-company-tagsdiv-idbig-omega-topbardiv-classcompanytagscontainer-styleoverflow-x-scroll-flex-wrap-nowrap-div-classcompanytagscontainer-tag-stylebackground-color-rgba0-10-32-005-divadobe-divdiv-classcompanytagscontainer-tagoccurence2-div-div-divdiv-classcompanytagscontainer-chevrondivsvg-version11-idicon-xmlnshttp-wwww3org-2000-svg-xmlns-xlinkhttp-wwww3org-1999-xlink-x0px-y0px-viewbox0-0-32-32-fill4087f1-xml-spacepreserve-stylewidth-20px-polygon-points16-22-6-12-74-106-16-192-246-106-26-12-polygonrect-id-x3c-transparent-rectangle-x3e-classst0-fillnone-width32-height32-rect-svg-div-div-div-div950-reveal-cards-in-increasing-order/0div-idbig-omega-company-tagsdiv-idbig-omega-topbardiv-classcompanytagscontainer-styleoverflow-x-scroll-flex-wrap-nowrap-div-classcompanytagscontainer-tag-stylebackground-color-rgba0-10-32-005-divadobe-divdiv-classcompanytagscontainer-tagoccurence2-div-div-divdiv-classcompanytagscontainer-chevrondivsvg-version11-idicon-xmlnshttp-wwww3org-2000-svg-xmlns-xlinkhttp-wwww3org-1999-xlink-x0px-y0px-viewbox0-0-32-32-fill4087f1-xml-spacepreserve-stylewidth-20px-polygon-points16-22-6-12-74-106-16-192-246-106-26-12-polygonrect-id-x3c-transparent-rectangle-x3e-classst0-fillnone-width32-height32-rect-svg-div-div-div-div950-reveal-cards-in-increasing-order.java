class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] result = new int[n]; //create a result array as size of deck to store cards in order
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i<n;i++){
            dq.add(i);  //initialize deque with index 0,1,2,...
        }
        for(int card : deck){
            int index = dq.poll(); // Get the next available index
            result[index] = card;  // Place the card in the result array
            if(!dq.isEmpty()){
                dq.add(dq.poll());  // Move the used index to the end of deque
            }
        }
        return result;
    }
}