class Solution {
    public boolean find132pattern(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int j=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<j) return true;
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                j=stack.pop();
            }
            stack.push(arr[i]);
        }
        return false;
    }
}
