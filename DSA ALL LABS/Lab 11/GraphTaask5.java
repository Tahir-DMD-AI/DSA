
package graphusingadjacencymatrix;
/**
 *
 * @author Tahir Mahmood
 */
import java.util.*;
class GraphTaasks5{
    public static void findConnectedComponents(int[][] adjMatrix){
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        List<List<Integer>> connectedComponents = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                List<Integer> component = new ArrayList<>();
                dfsForComponents(adjMatrix, i, visited, component);
                connectedComponents.add(component);
            }
        }
        System.out.println("Connected Components:");
        for(int i = 0; i < connectedComponents.size(); i++){
            System.out.print("Component " + (i + 1) + ": ");
            System.out.println(connectedComponents.get(i));
        }
    }
    private static void dfsForComponents(int[][] adjMatrix, int current, boolean[] visited, List<Integer> component){
        visited[current] = true;
        component.add(current + 1); 
        for(int i = 0; i < adjMatrix.length; i++){
            if(adjMatrix[current][i] > 0 && !visited[i]){
                dfsForComponents(adjMatrix, i, visited, component);
            }
        }
    }
    public static void main(String[] args){
        int[][] adjMatrix ={
            {0, 1, 1, 0, 0},
            {1, 0, 1, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0}
        };
        System.out.println("Task 5: Detect Connected Components");
        findConnectedComponents(adjMatrix);
    }
}
