package graphusingadjacencymatrix;
/**
 *
 * @author Tahir Mahmood
 */
import java.util.*;
public class GraphTasks{
    public static void findShortestPathWeighted(int[][] adjMatrix, int start, int destination) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        int[] parent = new int[n];
        for(int i = 0; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }
        distance[start] = 0;
        for(int count = 0; count < n - 1; count++){
            int u = -1;
            for(int i = 0; i < n; i++){
                if (!visited[i] && (u == -1 || distance[i] < distance[u])) {
                    u = i;
                }
            }
            if(distance[u] == Integer.MAX_VALUE) break;
            visited[u] = true;
            for(int v = 0; v < n; v++){
                if (adjMatrix[u][v] > 0 && !visited[v] && distance[u] + adjMatrix[u][v] < distance[v]) {
                    distance[v] = distance[u] + adjMatrix[u][v];
                    parent[v] = u;
                }
            }
        }
        if(distance[destination] == Integer.MAX_VALUE){
            System.out.println("No path found.");
            return;
        }
        List<Integer> path = new ArrayList<>();
        for(int at = destination; at != -1; at = parent[at]){
            path.add(at);
        }
        System.out.print("Shortest Path: ");
        for(int i = path.size() - 1; i >= 0; i--){
            System.out.print((path.get(i) + 1));
            if(i > 0){
                System.out.print(" -> ");
            }
        }
        System.out.println("\nLength: " + distance[destination]);
    }
    public static void main(String[] args){
        int[][] adjMatrix = {
            {0, 2, 4, 0},
            {2, 0, 0, 3},
            {4, 0, 0, 1},
            {0, 3, 1, 0}
        };
        System.out.println("Task 3: Find Shortest Path");
        findShortestPathWeighted(adjMatrix, 0, 3); 
    }
}

