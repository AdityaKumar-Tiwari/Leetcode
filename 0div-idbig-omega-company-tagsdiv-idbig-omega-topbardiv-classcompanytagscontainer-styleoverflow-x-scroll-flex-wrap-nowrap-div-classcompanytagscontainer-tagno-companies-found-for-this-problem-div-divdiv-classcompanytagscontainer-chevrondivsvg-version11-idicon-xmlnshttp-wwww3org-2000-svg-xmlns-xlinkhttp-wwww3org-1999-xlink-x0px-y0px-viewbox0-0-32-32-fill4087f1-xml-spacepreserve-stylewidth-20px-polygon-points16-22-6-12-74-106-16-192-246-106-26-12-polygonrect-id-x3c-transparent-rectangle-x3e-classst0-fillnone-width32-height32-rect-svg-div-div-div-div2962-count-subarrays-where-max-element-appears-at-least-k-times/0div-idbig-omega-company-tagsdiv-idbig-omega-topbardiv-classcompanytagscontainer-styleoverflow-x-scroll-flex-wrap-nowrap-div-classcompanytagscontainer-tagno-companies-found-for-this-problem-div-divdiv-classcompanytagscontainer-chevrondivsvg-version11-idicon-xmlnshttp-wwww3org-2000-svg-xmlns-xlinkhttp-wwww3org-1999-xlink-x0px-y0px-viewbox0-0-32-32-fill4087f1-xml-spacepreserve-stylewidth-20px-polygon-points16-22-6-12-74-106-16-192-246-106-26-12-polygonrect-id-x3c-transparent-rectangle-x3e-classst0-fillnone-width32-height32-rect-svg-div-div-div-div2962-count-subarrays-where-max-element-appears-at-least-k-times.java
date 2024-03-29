class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxElement = Integer.MIN_VALUE;  //to find max element
        for(int i = 0 ; i<n ; i++){
            maxElement = Math.max(maxElement, nums[i]); //max element or current element
        }
        int i =0, j=0 , result =0;  //sliding window
        long count = 0;
        while(j<n){
            //expansion
            if(nums[j] == maxElement){
                result++;  //added to result
            }
            //shrinking
            while(result == k){
                count = count+(n-j);
                if(nums[i] == maxElement){
                    result--;  //after shrinking added to result
                }
                i++;
            }
            j++;
        }
        return count;
    }
}