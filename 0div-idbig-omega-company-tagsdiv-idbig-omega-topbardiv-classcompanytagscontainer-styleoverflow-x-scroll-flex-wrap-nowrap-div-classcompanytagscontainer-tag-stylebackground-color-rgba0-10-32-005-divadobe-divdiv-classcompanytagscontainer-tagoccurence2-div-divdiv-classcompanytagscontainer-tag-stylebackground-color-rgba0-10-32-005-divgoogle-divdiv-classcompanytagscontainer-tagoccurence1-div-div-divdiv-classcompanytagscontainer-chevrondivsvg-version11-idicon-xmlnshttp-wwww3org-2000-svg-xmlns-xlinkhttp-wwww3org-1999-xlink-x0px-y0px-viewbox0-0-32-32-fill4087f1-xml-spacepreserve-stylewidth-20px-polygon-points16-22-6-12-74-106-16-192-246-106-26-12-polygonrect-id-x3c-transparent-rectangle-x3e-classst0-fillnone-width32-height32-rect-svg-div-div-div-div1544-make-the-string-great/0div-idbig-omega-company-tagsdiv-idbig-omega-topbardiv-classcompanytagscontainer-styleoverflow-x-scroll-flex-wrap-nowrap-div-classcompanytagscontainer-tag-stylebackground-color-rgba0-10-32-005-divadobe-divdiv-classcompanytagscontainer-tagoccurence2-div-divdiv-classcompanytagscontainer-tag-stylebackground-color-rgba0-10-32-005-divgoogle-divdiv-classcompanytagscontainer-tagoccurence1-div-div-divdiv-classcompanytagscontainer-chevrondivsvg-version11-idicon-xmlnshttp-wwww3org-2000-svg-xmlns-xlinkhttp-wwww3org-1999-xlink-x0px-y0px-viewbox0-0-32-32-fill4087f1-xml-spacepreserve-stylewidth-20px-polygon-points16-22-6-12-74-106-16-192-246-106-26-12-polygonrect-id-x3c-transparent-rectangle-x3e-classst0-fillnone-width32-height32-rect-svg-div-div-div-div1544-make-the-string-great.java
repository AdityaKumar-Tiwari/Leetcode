class Solution {
    public String makeGood(String s) {
        String ans=new String("");
        for(int i=0;i<s.length()-1;i++){
//cheak for character difference between current character and adjacent character
            if(Math.abs(s.charAt(i)-s.charAt(i+1))==32){
                ans=s.substring(0,i)+s.substring(i+2,s.length());
                s=ans;
                i=-1;  //to again iterate
            }
        }
        return s;
    }
}
