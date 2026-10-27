public class Main {

    public static void main(String[] args) {

        // Test Linked Queue
        System.out.println("=== Linked Queue ===");

        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();
        queue.peek();
        queue.dequeue();
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());

        // Test Graph
        System.out.println("\n=== Graph ===");

        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");

        graph.displayGraph();

        graph.BFS("A");
    }
}