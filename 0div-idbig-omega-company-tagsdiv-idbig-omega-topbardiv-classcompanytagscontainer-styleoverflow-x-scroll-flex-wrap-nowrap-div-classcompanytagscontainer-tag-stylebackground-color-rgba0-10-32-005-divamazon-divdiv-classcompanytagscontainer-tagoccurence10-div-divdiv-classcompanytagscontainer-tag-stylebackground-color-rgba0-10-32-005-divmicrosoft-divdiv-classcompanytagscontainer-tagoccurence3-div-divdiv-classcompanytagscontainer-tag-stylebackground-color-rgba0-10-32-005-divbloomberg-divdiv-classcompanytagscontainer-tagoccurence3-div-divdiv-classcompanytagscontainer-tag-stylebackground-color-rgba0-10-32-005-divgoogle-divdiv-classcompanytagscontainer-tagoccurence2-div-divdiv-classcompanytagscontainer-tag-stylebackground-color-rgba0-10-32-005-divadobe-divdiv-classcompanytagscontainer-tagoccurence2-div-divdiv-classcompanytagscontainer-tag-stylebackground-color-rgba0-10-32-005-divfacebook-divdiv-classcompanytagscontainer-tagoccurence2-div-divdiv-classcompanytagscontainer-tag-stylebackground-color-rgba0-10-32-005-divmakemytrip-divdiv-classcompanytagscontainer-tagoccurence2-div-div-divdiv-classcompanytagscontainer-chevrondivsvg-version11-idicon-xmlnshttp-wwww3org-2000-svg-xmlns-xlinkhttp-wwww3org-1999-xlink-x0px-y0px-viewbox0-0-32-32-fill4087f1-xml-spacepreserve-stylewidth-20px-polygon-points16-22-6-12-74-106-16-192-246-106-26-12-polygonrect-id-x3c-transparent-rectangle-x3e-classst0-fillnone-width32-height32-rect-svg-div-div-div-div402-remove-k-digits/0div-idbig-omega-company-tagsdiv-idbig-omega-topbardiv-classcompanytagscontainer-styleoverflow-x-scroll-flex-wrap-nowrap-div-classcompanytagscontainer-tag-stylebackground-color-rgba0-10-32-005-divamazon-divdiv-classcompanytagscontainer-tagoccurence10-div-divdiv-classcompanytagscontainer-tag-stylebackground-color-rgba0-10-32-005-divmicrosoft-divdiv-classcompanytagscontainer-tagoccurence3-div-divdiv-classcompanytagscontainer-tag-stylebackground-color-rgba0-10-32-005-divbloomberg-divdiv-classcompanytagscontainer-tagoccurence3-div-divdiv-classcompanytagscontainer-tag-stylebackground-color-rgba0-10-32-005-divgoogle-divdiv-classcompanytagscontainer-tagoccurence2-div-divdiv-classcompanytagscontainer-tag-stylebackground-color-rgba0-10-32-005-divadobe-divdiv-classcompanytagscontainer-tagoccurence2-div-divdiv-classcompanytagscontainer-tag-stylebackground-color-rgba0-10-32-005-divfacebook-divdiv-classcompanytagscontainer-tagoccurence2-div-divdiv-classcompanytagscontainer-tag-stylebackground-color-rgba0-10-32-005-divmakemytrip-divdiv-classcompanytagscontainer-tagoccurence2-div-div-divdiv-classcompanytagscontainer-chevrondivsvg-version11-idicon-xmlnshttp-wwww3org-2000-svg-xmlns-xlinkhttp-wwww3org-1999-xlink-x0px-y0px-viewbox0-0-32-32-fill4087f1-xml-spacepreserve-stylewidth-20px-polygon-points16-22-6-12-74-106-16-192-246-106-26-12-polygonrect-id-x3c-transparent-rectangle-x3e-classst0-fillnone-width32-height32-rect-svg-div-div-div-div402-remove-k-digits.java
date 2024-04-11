class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> mystack = new Stack<>(); //create a stack

        for(char digit : num.toCharArray()){
// While there are remaining removals (k) and the stack is not empty and the current digit is smaller than the top of the stack
            while(k > 0 && !mystack.isEmpty() && digit < mystack.peek()){
                mystack.pop();
                k--;
            }
            mystack.push(digit);  // Push the current digit to the stack
        }
        while(k > 0 && !mystack.isEmpty()){  //if there are still remaining removals
            mystack.pop();
            k--;
        }
        // Construct the result string by popping digits from the stack
         StringBuilder temp = new StringBuilder();
         while(!mystack.isEmpty()){
            temp.append(mystack.pop());
         }
         temp.reverse();  //to get the correct order

         // Remove leading zeros and construct the final result
         int m = temp.length();
         StringBuilder result = new StringBuilder();
         int foundNonZero = 0;
         for(int i = 0; i< m; i++){
            if(temp.charAt(i) == '0' && foundNonZero == 0){
                continue;
            }else{
                result.append(temp.charAt(i));
                foundNonZero = 1;
            }
         }
         // If the result is empty, return "0"
        if (result.length() == 0)
            result.append('0');
        return result.toString();
    }
}