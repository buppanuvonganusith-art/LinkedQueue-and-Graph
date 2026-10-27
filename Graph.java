import java.util.*;

public class Graph {

    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new LinkedHashMap<>();
    }

    // Add a vertex
    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an undirected edge
    public void addEdge(String vertex1, String vertex2) {
        if (!adjacencyList.containsKey(vertex1)
                || !adjacencyList.containsKey(vertex2)) {
            System.out.println("Vertex not found.");
            return;
        }

        if (!adjacencyList.get(vertex1).contains(vertex2)) {
            adjacencyList.get(vertex1).add(vertex2);
        }

        if (!adjacencyList.get(vertex2).contains(vertex1)) {
            adjacencyList.get(vertex2).add(vertex1);
        }
    }

    // Display the graph
    public void displayGraph() {
        System.out.println("Graph (Adjacency List):");

        for (String vertex : adjacencyList.keySet()) {
            System.out.println(
                    vertex + " -> " + adjacencyList.get(vertex)
            );
        }
    }

    // Breadth-First Search
    public void BFS(String startVertex) {
        if (!adjacencyList.containsKey(startVertex)) {
            System.out.println("Starting vertex not found.");
            return;
        }

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.offer(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }
}