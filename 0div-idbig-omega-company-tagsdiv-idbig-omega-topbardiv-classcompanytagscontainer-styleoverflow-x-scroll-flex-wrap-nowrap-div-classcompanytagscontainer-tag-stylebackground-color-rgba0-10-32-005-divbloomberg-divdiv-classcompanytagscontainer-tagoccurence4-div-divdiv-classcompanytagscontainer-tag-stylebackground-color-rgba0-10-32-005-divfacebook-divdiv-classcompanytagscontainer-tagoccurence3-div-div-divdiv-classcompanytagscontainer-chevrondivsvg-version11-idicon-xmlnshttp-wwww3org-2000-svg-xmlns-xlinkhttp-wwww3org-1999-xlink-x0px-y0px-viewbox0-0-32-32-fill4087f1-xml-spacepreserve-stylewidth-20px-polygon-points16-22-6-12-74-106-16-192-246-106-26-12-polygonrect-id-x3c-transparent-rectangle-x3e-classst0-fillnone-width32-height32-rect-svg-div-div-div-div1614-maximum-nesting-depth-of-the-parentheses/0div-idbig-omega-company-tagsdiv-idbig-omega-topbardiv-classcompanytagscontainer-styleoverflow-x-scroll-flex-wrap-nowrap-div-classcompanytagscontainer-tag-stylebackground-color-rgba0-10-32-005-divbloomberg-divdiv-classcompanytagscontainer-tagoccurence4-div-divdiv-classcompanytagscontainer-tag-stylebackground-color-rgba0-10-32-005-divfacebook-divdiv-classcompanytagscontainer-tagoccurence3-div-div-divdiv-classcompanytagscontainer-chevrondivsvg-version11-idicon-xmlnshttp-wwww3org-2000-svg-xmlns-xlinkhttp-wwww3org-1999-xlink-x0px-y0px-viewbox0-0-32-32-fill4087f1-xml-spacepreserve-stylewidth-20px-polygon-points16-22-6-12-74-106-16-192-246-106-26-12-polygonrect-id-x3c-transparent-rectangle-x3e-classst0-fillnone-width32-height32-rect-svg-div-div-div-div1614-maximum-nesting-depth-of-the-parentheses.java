class Solution {
    public int maxDepth(String s) {
        int OpenBrackets = 0;
        int result = 0;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '('){
            OpenBrackets++;
            }
            else if(s.charAt(i) == ')'){
            OpenBrackets--;
            }
            result = Math.max(result, OpenBrackets);
        }
        return result;
    }
}