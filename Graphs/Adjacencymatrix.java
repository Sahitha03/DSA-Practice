import java.util.Scanner;

public class Adjacencymatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges
        
        int adj[][] = new int[n+1][n+1]; // Correctly define a 2D array
        
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;  // For an undirected graph
            adj[v][u] = 1;
        }
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
