class Solution {
    public int numJewelsInStones(String jewels, String stones){
        Set<Character> jewelSet = new HashSet<>(); //set for all the jewels
        for(int i =0; i<jewels.length(); i++){
            jewelSet.add(jewels.charAt(i));
        }

            int score = 0; //find the value
            for(int i=0; i<stones.length();i++){
                if(jewelSet.contains(stones.charAt(i))){
                    score++;
            } 
        }
        return score;

    }
}