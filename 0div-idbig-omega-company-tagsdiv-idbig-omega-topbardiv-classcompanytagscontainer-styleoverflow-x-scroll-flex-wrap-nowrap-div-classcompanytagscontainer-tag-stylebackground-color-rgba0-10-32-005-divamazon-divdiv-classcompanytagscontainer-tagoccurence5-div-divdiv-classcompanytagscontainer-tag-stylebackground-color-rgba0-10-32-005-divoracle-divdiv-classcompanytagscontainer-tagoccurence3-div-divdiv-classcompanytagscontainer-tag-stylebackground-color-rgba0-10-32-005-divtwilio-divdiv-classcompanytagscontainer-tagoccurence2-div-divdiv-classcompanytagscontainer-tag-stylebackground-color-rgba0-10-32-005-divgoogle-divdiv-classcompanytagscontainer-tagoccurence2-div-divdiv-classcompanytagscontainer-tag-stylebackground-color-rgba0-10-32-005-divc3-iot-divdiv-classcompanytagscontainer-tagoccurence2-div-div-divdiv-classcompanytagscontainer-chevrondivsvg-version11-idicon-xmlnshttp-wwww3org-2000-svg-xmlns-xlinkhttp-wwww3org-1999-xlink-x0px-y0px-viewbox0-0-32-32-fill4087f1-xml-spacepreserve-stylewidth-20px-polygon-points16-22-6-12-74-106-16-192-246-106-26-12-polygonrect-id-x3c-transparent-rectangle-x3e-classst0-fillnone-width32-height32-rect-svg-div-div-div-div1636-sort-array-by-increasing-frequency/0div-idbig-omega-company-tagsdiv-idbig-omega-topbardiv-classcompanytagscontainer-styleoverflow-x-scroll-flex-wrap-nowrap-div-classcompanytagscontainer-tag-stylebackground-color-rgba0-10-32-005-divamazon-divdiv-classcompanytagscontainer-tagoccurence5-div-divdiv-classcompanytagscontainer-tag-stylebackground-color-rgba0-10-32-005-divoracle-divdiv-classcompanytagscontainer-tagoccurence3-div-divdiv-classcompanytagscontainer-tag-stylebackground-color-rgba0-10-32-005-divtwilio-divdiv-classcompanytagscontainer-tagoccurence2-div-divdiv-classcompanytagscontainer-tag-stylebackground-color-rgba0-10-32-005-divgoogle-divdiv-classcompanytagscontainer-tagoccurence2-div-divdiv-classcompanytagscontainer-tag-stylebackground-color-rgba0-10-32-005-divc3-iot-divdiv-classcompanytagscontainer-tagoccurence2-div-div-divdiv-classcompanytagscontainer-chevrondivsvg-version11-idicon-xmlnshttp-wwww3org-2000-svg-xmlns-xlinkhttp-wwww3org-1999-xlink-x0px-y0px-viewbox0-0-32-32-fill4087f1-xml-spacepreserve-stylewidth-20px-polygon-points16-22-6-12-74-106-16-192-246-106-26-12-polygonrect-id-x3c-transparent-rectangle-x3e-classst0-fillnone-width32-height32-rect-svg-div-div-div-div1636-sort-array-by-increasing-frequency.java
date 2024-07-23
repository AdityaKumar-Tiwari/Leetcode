class Solution {
    public int[] frequencySort(int[] nums) {
       int n = nums.length;
       Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i< n; i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
       } 
       //Convert the array to an Integer array
       Integer[] countfrequency = new Integer[n];
       for(int i = 0; i< n; i++){
        countfrequency[i] = nums[i];
       }
       //Sort based on custom comparator
       Arrays.sort(countfrequency, (a,b) -> {
        if(map.get(a).equals(map.get(b))){
            return Integer.compare(b,a); //in desending order
        }
        return Integer.compare(map.get(a) , map.get(b)); //sort by frequency order
       });
       //convert to int arrray
       for(int i = 0; i<n; i++){
        nums[i] = countfrequency[i];
       }
       return nums;
    }
}