class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0; //to handle edge cases
        int i = 0,j =0;
        int count = 0, product = 1;
        int n = nums.length;
        while(j < n){
            product *= nums[j];

            while(product >= k){
                product /= nums[i];
                i++;
            }
            count += (j-i+1);  //no of subarray ending at j
            j++;
        }
        return count;
    }
}