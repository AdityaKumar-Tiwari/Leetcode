class Solution {
    String modifiedNumber="";
    public String reformatNumber(String number) {
        // Remove all spaces and hyphens from the input number
        modifiedNumber=number.replace(" ","");
        modifiedNumber=modifiedNumber.replace("-","");

        // Get the length of the cleaned number
        int l=modifiedNumber.length();
        // If the length is less than or equal to 3, return the number as is
        if(l<=3){
            return modifiedNumber;
   // If the length is exactly 4, split it into two groups of 2 digits
        } else if(l==4){
            return modifiedNumber.substring(0,2)+"-"+ modifiedNumber.substring(2,4);
// For length greater than 4, split into groups of 3 digits followed by recursion
        } else {
            modifiedNumber=modifiedNumber.substring(0,3)+"-"+reformatNumber(modifiedNumber.substring(3,l));
        }
        return modifiedNumber;
    }
}