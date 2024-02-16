class Solution {
    public int[] constructRectangle(int area) {
        int L =area ,W =1;
        int[] result = new int[] {L, W};
        while(L>=W){
            if(area == L*W){
                result = new int[]{L, W} ;
            }
            W++;
            L= area/W;
        }
        return result;
    }
}