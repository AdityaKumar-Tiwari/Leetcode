class Solution {
    public int findMaxLength(int[] nums){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);           //initalize 0-->-1 and 1-->+1 for sum
        int sum = 0;
        for(int i =0; i< nums.length;i++){
            if(nums[i] == 0){
                sum += -1;
            }
            else if(nums[i] == 1){
                sum += +1;
            }
            if(map.containsKey(sum)){
                int index = map.get(sum);          //to cheak whether sum already exists in this map or not
                int length = i - index;
                if (length > ans){
                    ans = length;
                }
            }else{
                map.put(sum,i);
            }
        }
        return ans;

    }
}