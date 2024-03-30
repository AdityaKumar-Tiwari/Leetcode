class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int subWithMaxK = subarrayWithAtMostK(nums, k);
        int reducedSubWithMaxK = subarrayWithAtMostK(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
    }
    public int subarrayWithAtMostK(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i =0, j= 0, result = 0;
        //sliding window
        while(j<n){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while(map.size() > k){
                map.put(nums[i], map.get(nums[i])-1);
                // If the count becomes 0, remove the element from the map
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            result += j-i+1;  //size of subarray end with j
            j++;
        }
        return result;
    }
}