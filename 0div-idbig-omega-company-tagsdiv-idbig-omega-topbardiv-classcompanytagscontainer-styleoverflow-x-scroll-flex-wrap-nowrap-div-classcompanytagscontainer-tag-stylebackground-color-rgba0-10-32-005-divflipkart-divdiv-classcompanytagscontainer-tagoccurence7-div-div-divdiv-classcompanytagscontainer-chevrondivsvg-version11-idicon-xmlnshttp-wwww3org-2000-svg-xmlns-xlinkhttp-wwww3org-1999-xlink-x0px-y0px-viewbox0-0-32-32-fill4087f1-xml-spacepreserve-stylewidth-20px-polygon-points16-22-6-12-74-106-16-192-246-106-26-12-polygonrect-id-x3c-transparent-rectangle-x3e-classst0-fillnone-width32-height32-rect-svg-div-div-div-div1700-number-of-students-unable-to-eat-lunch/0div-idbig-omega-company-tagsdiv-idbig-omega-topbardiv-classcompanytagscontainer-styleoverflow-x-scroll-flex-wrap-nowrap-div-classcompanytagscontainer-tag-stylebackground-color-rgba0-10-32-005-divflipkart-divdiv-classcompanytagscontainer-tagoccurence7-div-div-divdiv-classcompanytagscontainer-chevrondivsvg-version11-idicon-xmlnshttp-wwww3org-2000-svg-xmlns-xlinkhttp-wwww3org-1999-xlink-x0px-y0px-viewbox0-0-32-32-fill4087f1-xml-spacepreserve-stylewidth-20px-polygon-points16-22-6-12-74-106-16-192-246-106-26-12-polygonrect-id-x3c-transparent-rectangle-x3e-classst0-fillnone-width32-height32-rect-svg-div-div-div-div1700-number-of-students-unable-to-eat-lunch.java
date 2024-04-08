class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int[] arr = new int[2];
        //arr[0] = count of student liking 0 sandwich
        //arr[1] = count of student liking 1 sandwich
        for(int student : students){
            arr[student]++; //this is count
        }
        for(int i = 0; i< n; i++){
            int sand = sandwiches[i];
            if(arr[sand] == 0){
                return n-i;
            }
            arr[sand]--;
        }
        return 0;
    }
}