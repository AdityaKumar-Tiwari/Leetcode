class Solution {
    public int passThePillow(int n, int time) {
      int compleated = time/(n-1);
      int remaining = time%(n-1);
      int result = 0;
      if(compleated % 2 != 0){  //odd no of cycle
        result = n-remaining;
      }  
      else{
        result = remaining +1;
      }
      return result;
    }
}