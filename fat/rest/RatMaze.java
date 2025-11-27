package fat.rest;

public public class RatMaze {
    static int N;

    // Main solver function
    public boolean solveMaze(int[][] maze) {
        N = maze.length;
        int[][] sol = new int[N][N];

        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    // Recursive Backtracking Utility
    private boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        // 1. Base Case: If we reached destination
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // 2. Check if maze[x][y] is a valid move
        if (isSafe(maze, x, y, sol)) {
            // Mark x, y as part of solution path
            sol[x][y] = 1;

            // 3. Move Forward in directions (Down, Right, Up, Left)
            // Note: Order matters for the path found
            if (solveMazeUtil(maze, x + 1, y, sol)) return true; // Down
            if (solveMazeUtil(maze, x, y + 1, sol)) return true; // Right
            if (solveMazeUtil(maze, x - 1, y, sol)) return true; // Up
            if (solveMazeUtil(maze, x, y - 1, sol)) return true; // Left

            // 4. Backtrack: If none of the above moves work, unmark x, y
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    // Check if x, y is valid index, open (1), and not yet visited in current path
    private boolean isSafe(int[][] maze, int x, int y, int[][] sol) {
        return (x >= 0 && x < N && 
                y >= 0 && y < N && 
                maze[x][y] == 1 && 
                sol[x][y] == 0); // Ensure we don't revisit nodes in current path
    }

    private void printSolution(int[][] sol) {
        for (int[] row : sol) {
            for (int val : row) {
                System.out.print(" " + val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RatMaze rat = new RatMaze();
        // 1 = Open, 0 = Blocked
        int[][] maze = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };
        rat.solveMaze(maze);
    }
} {
    
}
