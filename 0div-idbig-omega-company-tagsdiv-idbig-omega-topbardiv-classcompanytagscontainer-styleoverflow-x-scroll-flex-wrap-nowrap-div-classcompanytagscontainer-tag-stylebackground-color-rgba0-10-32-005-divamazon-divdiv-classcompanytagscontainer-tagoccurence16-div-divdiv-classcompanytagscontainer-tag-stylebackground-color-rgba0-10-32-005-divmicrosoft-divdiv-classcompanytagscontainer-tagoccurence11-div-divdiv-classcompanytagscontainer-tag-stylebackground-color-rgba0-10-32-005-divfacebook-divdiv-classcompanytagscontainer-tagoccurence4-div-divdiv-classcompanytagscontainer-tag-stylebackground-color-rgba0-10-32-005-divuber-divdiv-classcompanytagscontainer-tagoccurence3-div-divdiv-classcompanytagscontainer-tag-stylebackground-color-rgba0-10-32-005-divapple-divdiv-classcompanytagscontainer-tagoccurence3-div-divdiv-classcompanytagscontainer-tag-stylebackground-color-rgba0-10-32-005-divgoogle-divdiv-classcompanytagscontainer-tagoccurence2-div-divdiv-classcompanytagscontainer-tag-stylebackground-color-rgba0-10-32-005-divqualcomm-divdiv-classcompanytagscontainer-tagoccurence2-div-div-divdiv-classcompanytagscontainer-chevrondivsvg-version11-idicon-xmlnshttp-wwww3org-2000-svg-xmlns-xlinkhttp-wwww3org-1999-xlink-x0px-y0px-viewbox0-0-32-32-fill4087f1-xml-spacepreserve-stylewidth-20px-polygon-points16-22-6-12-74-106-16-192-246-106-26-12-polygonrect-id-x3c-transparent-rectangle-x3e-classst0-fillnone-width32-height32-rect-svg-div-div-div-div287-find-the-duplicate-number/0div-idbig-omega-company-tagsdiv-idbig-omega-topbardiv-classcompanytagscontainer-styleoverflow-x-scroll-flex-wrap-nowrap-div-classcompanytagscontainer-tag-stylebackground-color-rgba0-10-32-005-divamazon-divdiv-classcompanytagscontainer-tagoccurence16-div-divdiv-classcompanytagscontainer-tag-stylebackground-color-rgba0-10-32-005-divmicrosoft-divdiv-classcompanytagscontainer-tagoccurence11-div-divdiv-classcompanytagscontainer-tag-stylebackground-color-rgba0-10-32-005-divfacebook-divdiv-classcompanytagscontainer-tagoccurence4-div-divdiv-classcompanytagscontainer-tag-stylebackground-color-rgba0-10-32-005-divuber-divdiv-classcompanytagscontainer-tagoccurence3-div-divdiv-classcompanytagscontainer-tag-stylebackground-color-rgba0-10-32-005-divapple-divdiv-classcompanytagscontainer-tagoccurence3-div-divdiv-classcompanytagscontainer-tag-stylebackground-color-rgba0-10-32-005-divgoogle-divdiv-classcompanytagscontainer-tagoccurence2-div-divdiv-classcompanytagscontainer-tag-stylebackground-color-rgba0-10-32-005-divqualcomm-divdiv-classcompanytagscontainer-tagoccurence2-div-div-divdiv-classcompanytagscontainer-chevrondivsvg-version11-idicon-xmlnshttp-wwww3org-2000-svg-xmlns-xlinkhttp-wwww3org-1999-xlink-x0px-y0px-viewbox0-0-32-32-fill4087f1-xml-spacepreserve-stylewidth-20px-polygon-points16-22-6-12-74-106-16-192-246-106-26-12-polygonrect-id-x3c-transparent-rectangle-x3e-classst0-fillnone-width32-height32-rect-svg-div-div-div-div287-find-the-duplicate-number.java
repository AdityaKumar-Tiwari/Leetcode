class Solution {
    public int findDuplicate(int[] nums) {
        //will go with the slow and fast pointer approach
        int slow = 0, fast =0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = 0;
        while(slow != fast){
            slow =nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}