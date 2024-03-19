class Solution {
    public int leastInterval(char[] tasks, int n) {
        int f[] = new int[26];  //create a frequency array of size 26
        for(char task : tasks){
            f[task - 'A']++;     //first fill with A and then subtract the A and increase/ update the array
            }
            Arrays.sort(f);       //sort the array
            int chunk = f[25] - 1; //f[25] is the last index of the array 
            int idleSpots = chunk*n;

            //now place the other task in those idle spot so start with second last char as 1st one we already place
            for(int i =24; i>= 0; i--){
                idleSpots -= Math.min(chunk, f[i]);  //reduce the idle spots
                if(idleSpots < 0){
                    return tasks.length;
            }
        }
        return idleSpots+tasks.length;
    }
}