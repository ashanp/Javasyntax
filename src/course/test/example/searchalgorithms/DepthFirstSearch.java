/*
 * DFS is an algorithm used to traverse or search tree and graph structures. 
 * It explores as far as possible along a branch before backtracking. 
 * DFS is often used in various applications, 
 * including graph traversal and pathfinding.
 */

package course.test.example.searchalgorithms;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {

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

        // Depth-First Search traversal
        void DFS(int startVertex) {
            boolean[] visited = new boolean[V];
            Stack<Integer> stack = new Stack<>();

            // Push the start vertex onto the stack
            stack.push(startVertex);

            while (!stack.isEmpty()) {
                int vertex = stack.pop();

                if (!visited[vertex]) {
                    System.out.print(vertex + " "); // Process the vertex
                    visited[vertex] = true;

                    // Push all adjacent vertices onto the stack
                    for (Integer neighbor : adjacencyList[vertex]) {
                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
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

        System.out.print("DFS traversal starting from vertex 0: ");
        graph.DFS(0);
    }
}
