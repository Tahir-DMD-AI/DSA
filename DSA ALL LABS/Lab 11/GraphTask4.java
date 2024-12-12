/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphusingadjacencymatrix;

/**
 *
 * @author Tahir Mahmood
 */
import java.util.*;
class GraphTasks4{
    public static void findShortestPathWeighted(int[][] adjMatrix, int start, int destination){
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
                if(!visited[i] && (u == -1 || distance[i] < distance[u])){
                    u = i;
                }
            }
            if(distance[u] == Integer.MAX_VALUE) break;
            visited[u] = true;
            for(int v = 0; v < n; v++){
                if(adjMatrix[u][v] > 0 && !visited[v] && distance[u] + adjMatrix[u][v] < distance[v]){
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
        for (int i = path.size() - 1; i >= 0; i--){
            System.out.print((path.get(i) + 1));
            if (i > 0) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\nLength: " + distance[destination]);
    }
    public static void findAllPaths(int[][] adjMatrix, int start, int destination){
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        List<Integer> currentPath = new ArrayList<>();
        List<List<Integer>> allPaths = new ArrayList<>();
        findPathsDFS(adjMatrix, start, destination, visited, currentPath, allPaths);
        System.out.println("All Paths from " + (start + 1) + " to " + (destination + 1) + ":");
        for(List<Integer> path : allPaths){
            int length = calculatePathLength(path, adjMatrix);
            for(int i = 0; i < path.size(); i++){
                System.out.print((path.get(i) + 1));
                if(i < path.size() - 1){
                    System.out.print(" -> ");
                }
            }
            System.out.println(" (Length: " + length + ")");
        }
    }
    private static void findPathsDFS(int[][] adjMatrix, int current, int destination, boolean[] visited, List<Integer> currentPath, List<List<Integer>> allPaths){
        visited[current] = true;
        currentPath.add(current);
        if(current == destination){
            allPaths.add(new ArrayList<>(currentPath));
        }else{
            for(int i = 0; i < adjMatrix.length; i++){
                if(adjMatrix[current][i] > 0 && !visited[i]){
                    findPathsDFS(adjMatrix, i, destination, visited, currentPath, allPaths);
                }
            }
        }
        currentPath.remove(currentPath.size() - 1);
        visited[current] = false;
    }
    private static int calculatePathLength(List<Integer> path, int[][] adjMatrix){
        int length = 0;
        for(int i = 0; i < path.size() - 1; i++){
            length += adjMatrix[path.get(i)][path.get(i + 1)];
        }
        return length;
    }
    public static void main(String[] args){
        int[][] adjMatrix ={
            {0, 2, 4, 0},
            {2, 0, 0, 3},
            {4, 0, 0, 1},
            {0, 3, 1, 0}
        };
        System.out.println("Task 3: Find Shortest Path");
        findShortestPathWeighted(adjMatrix, 0, 3); 
        System.out.println("\nTask 4: Find All Paths");
        findAllPaths(adjMatrix, 0, 3); 
    }
}
