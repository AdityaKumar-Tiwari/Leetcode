class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        //Initialize distance matrix
        int[][] distance = new int[n][n];
        for(int i = 0; i< n; i++){
            Arrays.fill(distance[i] , 10001); // Use 10001 as infinity
            distance[i][i] = 0; // distance to itself is 0
        }
        //build initial graph 
        //the graph is bidirectional, we set the distance for both directions.
        for(int[] edge : edges){
            distance[edge[0]][edge[1]] = edge[2];
            distance[edge[1]][edge[0]] = edge[2];
        }
        //floyd -warshell algorithm
        for(int k = 0; k < n; k++){
            for(int i = 0; i< n; i++){
                for(int j = 0; j < n; j++){
                    distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                }
            }
        }

        // Find the city with the smallest number of reachable cities
        int minRechablecities = n;
        int result = -1;

        for(int i = 0; i< n; i++){
            int rechablecities = 0;
            for(int j = 0; j<n; j++){
                if(distance[i][j] <= distanceThreshold){
                    rechablecities++;
                }
            }
            if(rechablecities <= minRechablecities){
                minRechablecities = rechablecities;
                result = i;
            }
        }
        return result;
    }
}