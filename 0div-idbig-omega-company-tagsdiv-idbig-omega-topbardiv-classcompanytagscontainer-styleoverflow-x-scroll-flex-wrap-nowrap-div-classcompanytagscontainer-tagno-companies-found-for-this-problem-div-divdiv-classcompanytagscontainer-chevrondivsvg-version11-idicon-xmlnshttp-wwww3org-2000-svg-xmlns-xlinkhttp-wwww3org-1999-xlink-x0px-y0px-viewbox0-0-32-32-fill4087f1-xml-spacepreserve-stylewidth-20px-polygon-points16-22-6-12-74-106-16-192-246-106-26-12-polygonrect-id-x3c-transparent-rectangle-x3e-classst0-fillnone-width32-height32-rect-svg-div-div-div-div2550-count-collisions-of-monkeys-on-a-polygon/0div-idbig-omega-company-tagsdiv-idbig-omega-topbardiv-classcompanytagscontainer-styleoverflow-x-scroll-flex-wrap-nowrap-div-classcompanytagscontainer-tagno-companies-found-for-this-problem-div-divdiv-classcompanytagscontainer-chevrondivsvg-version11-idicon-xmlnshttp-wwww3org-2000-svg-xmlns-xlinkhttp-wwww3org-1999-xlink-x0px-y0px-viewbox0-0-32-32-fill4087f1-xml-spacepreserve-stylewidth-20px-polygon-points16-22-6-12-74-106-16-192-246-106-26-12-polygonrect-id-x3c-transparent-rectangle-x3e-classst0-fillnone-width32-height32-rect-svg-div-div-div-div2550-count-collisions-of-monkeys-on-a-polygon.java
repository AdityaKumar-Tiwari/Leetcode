class Solution {
   private static int mod = 1000000007;
    public int monkeyMove(int n) {
        return (int) ((mod + pow(n) -2) % mod);
    }
    private static long pow(int n){
        if(n == 1) return 2;
        if(n % 2 == 0){
            long half = pow(n/2);
            return (half * half) % mod;
        }else{
            long half = pow(n/2);
            return((half * half) % mod) * 2 % mod;
        }
    }
}