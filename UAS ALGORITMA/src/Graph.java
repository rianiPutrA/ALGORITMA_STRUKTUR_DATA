import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjacencyList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public void buildGraphFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Masukkan jumla edge untuk Graph: ");
        int edges = scanner.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print("Masukkan edge" + (i + 1) + " (format: src dest): ");
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            addEdge(src, dest);
        }
    }
}
