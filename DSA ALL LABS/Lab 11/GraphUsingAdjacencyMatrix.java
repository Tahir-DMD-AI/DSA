package graphusingadjacencymatrix;
import java.util.Scanner;
//Task # 01
public class GraphUsingAdjacencyMatrix{
    private int[][] adjacencyMatrix;
    private int vertices;
    public GraphUsingAdjacencyMatrix(int vertices){
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }
    public void addEdge(int u, int v){
        adjacencyMatrix[u - 1][v - 1] = 1;
    }
//Task 2
    public void displayMatrix(){
        System.out.println("Adjacency Matrix:");
        System.out.print("   ");
        for(int i = 1; i <= vertices; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < vertices; i++){
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < vertices; j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        GraphUsingAdjacencyMatrix graph = new GraphUsingAdjacencyMatrix(vertices);

        System.out.println("Enter the edges as (u, v) pairs:");
        for(int i = 0; i < edges; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        graph.displayMatrix();
        scanner.close();
    }
}

