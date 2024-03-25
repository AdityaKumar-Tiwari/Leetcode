class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultset = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1; //get the index , element corresponding to it

            //if number appears to be negative then we have already encountered it so we will add that to resultset
            if(nums[index] < 0){
                resultset.add(index+1);
            }
            nums[index] = nums[index]* -1; //flip thr number at the index to negative
        } 
        return resultset;
    }
}