class Solution {
    public boolean checkValidString(String s) {
        int leftmin = 0, leftmax =0;  // use a greedy strategy
//use two variables leftMin and leftMax to represent the minimum and maximum number of open parentheses respectively.
        for(char c : s.toCharArray()){
            if(c == '('){
                leftmin++;
                leftmax++;
            }else if(c == ')'){
                leftmin--;
                leftmax--;
            }else{
                leftmin--;  //If the character is '*', decrement leftMin by 1 and increment leftMax by 1
                leftmax++;
            }
            //If leftMax becomes negative at any point, return False
            if(leftmax < 0) return false;
            // If leftMin becomes negative, reset it to 0 as we can't have negative open parentheses count.
            if(leftmin < 0) leftmin = 0;
        }
        return leftmin == 0;
    }
}