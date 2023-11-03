/*
 * A* is an informed search algorithm used in pathfinding and graph traversal. 
 * It uses a heuristic function to estimate the cost to reach the goal and explores the most promising paths first. 
 * A* combines elements of both breadth-first and depth-first search.
 */

package course.test.example.searchalgorithms;

import java.util.PriorityQueue;
import java.util.Comparator;

class Node {
    int x, y; // Coordinates of the node
    int f; // f = g + h (total cost)
    int g; // Cost from the start node to this node
    int h; // Heuristic cost from this node to the goal

    public Node(int x, int y, int g, int h) {
        this.x = x;
        this.y = y;
        this.g = g;
        this.h = h;
        this.f = g + h;
    }
}

public class AStarSearch {
    public static int[][] grid = {
        {0, 0, 0, 0, 0},
        {0, 1, 1, 0, 0},
        {0, 0, 0, 1, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 0, 0}
    };

    public static int numRows = 5;
    public static int numCols = 5;

    public static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

    // Custom comparator for the priority queue
    public static Comparator<Node> nodeComparator = (n1, n2) -> n1.f - n2.f;

    public static boolean isValid(int x, int y) {
        return x >= 0 && x < numRows && y >= 0 && y < numCols && grid[x][y] == 0;
    }

    public static int heuristic(int x, int y, int goalX, int goalY) {
        return Math.abs(x - goalX) + Math.abs(y - goalY); // Manhattan distance
    }

    public static void aStar(int startX, int startY, int goalX, int goalY) {
        PriorityQueue<Node> openSet = new PriorityQueue<>(nodeComparator);
        openSet.add(new Node(startX, startY, 0, heuristic(startX, startY, goalX, goalY)));

        while (!openSet.isEmpty()) {
            Node current = openSet.poll();

            if (current.x == goalX && current.y == goalY) {
                System.out.println("Path found!");
                return;
            }

            for (int[] direction : directions) {
                int newX = current.x + direction[0];
                int newY = current.y + direction[1];

                if (isValid(newX, newY)) {
                    int tentativeG = current.g + 1; // Assuming unit cost for movement

                    // Check if the new path to this node is shorter or it is not in the open set
                    if (tentativeG < current.g || !openSet.contains(new Node(newX, newY, 0, 0))) {
                        Node neighbor = new Node(newX, newY, tentativeG, heuristic(newX, newY, goalX, goalY));
                        openSet.add(neighbor);
                    }
                }
            }
        }

        System.out.println("Path not found!");
    }

    public static void main(String[] args) {
        int startX = 0;
        int startY = 0;
        int goalX = 4;
        int goalY = 4;

        aStar(startX, startY, goalX, goalY);
    }
}
