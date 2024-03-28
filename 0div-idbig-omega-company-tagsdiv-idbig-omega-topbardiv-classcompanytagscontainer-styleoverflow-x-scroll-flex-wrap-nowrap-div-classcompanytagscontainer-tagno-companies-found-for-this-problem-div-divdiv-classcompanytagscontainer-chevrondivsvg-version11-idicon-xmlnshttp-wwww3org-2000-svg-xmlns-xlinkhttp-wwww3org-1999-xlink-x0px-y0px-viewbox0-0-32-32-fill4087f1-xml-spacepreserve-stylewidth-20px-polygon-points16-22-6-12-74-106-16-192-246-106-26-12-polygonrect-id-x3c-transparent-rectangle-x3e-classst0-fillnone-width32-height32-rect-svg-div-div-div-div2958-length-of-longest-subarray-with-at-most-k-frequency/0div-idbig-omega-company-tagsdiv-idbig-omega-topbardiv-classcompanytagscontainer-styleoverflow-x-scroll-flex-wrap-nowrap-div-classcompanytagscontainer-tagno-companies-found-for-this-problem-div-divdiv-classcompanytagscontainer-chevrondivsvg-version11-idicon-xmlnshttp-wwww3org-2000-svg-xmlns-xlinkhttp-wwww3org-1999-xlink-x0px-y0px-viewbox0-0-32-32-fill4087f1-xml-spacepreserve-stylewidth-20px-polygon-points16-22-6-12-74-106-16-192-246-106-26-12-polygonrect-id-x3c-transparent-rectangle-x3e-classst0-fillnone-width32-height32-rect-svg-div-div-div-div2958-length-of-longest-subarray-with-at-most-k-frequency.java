class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();  //to store frequency of each element we use unordered map
        int i= 0 , j= 0;
        int result = 0; //to store value of result
        while(j<n){
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) +1);
            while(freq.get(nums[j]) > k){
               freq.put(nums[i], freq.get(nums[i]) -1);
                i++;

            }
            result = Math.max(result, j-i+1);
            j++;
        }
        return result;
    }
}