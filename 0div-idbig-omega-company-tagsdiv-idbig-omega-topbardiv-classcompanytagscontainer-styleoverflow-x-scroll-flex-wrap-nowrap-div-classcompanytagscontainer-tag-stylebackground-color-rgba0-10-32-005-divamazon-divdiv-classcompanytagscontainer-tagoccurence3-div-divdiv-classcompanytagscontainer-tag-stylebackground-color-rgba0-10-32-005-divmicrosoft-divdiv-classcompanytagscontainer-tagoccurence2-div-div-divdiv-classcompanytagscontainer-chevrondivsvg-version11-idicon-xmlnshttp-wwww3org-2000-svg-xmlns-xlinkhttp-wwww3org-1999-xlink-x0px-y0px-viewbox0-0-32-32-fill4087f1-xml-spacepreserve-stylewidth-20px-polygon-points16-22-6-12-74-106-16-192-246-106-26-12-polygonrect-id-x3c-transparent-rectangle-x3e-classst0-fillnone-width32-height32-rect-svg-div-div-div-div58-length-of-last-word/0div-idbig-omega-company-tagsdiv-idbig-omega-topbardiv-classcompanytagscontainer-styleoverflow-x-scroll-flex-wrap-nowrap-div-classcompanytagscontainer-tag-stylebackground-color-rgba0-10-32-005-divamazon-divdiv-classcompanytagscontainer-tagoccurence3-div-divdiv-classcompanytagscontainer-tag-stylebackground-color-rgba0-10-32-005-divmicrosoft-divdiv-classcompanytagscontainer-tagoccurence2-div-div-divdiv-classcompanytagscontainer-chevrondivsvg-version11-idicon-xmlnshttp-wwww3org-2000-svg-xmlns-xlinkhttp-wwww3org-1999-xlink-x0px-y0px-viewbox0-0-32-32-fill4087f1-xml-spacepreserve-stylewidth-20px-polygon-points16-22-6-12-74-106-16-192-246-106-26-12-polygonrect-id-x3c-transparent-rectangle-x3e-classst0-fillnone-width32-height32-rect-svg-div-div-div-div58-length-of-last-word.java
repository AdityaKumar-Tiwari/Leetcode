class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0;

       for(int i = s.length() -1; i>= 0; i--){
        //find the first character from backwards
        if(s.charAt(i) != ' '){
            count++;
        }
        else{
            if(count > 0) break;
        }
       }
       return count; 
    }
}