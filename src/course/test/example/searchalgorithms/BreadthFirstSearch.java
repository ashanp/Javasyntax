/*
 * BFS is another tree and graph traversal algorithm that explores all neighbor nodes 
 * at the current depth before moving on to nodes at the next level. 
 * It is often used to find the shortest path between two nodes in an unweighted graph.
 */

package course.test.example.searchalgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    static class Graph {
        private int V; // Number of vertices
        private LinkedList<Integer>[] adjacencyList; // Adjacency list

        public Graph(int v) {
            V = v;
            adjacencyList = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        // Function to add an edge to the graph
        void addEdge(int v, int w) {
            adjacencyList[v].add(w);
        }

        // Breadth-First Search traversal
        void BFS(int startVertex) {
            boolean[] visited = new boolean[V];
            Queue<Integer> queue = new LinkedList<>();

            visited[startVertex] = true;
            queue.offer(startVertex);

            while (!queue.isEmpty()) {
                int vertex = queue.poll();
                System.out.print(vertex + " "); // Process the vertex

                for (Integer neighbor : adjacencyList[vertex]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.print("BFS traversal starting from vertex 0: ");
        graph.BFS(0);
    }
}
