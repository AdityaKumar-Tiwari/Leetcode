class Solution {
    public int reverse(int x) {
       int num = Math.abs(x);  //find  Original number's absolute value 
        
        int rev = 0;  // Reversed number
        
        while (num != 0) {
            int ld = num % 10;  // calculate Last digit 
            
            // Overflow check
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0;  // if overflow happens, then return 0 
            }
            
            rev = rev * 10 + ld;  // Reverse main digit then add 
            num = num / 10;  //Remove Last digit for next iteration 
        }
        
        return (x < 0) ? (-rev) : rev;  //according to sign of orignal no return result
    }
}