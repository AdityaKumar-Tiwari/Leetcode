class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long result = 0;
        int minkposition = -1, maxkposition = -1, culpritIdx =-1;
        int n = nums.length;
        for(int i = 0; i< n; i++){
            //to find position of culprit index
            if(nums[i] < minK || nums[i] > maxK){
                culpritIdx = i;
            }
            //to find position of minimum index
            if(nums[i] == minK){
               minkposition = i; 
            }
            //to find position of maximum index
            if(nums[i] == maxK){
                maxkposition = i;
            }
            long smaller  = Math.min(minkposition, maxkposition);  //in smaller store min of (maxposition and minposition)
            long temp = smaller - culpritIdx; //in a temp variable store the result 
            result += (temp <= 0) ? 0: temp; //if temp <= 0 then put 0 in result else put the value of temp 
            

        }
        return result;
    }
}