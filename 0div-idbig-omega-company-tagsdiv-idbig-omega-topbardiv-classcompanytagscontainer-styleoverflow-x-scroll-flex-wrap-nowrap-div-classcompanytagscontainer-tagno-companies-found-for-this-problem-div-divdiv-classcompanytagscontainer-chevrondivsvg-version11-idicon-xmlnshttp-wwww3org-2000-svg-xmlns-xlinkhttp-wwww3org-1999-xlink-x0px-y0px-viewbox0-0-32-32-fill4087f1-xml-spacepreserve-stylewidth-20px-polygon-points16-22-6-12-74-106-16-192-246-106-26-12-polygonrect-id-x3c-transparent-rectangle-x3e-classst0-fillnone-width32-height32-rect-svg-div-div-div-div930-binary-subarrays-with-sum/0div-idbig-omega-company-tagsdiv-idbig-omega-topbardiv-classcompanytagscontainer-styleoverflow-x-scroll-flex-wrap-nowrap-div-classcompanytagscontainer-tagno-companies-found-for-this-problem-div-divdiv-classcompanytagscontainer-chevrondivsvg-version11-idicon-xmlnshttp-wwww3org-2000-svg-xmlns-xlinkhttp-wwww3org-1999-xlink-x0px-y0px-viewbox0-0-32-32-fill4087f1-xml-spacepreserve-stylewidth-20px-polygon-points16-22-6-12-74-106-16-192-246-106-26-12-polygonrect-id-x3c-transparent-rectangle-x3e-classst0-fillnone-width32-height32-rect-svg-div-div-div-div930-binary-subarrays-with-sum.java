class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int a;
        for(int i = 0; i < nums.length; i++){
            a = 0;
            for(int j = i; j < nums.length; j++){
                 a+= nums[j];
                if( a == goal ){
                    count+= 1;

                }
                else if(a > goal){
                    break;
                }
            }    

                

        }
        return count;
    }
}