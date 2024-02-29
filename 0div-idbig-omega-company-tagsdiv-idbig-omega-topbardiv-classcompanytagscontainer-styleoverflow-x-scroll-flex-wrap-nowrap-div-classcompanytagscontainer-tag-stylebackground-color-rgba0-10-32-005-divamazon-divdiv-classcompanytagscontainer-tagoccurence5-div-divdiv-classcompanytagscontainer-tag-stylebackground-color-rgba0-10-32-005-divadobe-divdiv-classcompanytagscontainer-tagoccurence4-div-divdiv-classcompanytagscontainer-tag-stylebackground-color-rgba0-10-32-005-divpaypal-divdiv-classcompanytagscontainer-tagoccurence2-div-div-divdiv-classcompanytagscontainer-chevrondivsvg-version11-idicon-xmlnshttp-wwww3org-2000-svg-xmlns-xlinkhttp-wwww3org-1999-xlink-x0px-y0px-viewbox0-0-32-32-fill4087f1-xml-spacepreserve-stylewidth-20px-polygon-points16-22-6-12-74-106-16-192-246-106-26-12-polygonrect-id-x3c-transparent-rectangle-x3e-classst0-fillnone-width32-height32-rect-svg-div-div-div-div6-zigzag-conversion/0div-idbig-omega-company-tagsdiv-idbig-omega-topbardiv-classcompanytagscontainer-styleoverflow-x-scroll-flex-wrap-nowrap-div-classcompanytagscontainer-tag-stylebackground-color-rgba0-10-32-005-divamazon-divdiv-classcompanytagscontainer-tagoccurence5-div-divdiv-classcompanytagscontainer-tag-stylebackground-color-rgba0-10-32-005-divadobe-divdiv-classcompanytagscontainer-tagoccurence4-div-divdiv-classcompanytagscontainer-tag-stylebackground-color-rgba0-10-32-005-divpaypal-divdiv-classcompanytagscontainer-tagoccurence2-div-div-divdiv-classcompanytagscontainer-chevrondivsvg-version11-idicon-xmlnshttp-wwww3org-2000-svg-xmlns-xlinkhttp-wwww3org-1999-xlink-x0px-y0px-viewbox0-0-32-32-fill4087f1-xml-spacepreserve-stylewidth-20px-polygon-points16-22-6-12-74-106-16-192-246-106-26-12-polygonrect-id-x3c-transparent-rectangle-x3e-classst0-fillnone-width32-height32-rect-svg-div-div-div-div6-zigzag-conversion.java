class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder str = new StringBuilder();
        int n = s.length();
        int k = 2*(numRows-1); //as formualated that after zigzag there is gap of 6 is there in 1st and last string so we can write 6 as (n-1))*2 
        for(int i =0; i<numRows;i++){
            int index = i;
            while(index<n){
                str.append(s.charAt(index));
                if(i!= 0 && i!= numRows-1){
                    int k1 = k-(2*i);   //to know the indices as the formula says ((n-1)*2)*2[i]
                    int k2 = index + k1;
                    if(k2 < n){
                        str.append(s.charAt(k2));
                    }
                }
                index = index + k;
            }
        }
        return str.toString();
    }
}