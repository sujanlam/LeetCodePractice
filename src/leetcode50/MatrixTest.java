package leetcode50;

import java.util.HashSet;
import java.util.Set;

public class MatrixTest {
    public static boolean checkConditionMatrix(int[][] grid) {
        int n = grid.length;
        Set<Integer> expectedSet = new HashSet<>();

        // Populate the expected set of numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            expectedSet.add(i);
        }

        // Check each row
        for (int i = 0; i < n; i++) {
            Set<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                rowSet.add(grid[i][j]);
            }
            if (!rowSet.equals(expectedSet)) {
                return false;
            }
        }

        // Check each column
        for (int j = 0; j < n; j++) {
            Set<Integer> colSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                colSet.add(grid[i][j]);
            }
            if (!colSet.equals(expectedSet)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {2, 3, 1},
                {1, 2, 3},
                {3, 1, 2},
        };
        int[][] grid2 = {
                {1, 2, 3},
                {3, 2, 1},
                {3, 1, 2},
        };
        int[][] grid3 = {
                {2, 2, 3},
                {3, 1, 2},
                {2, 3, 1},
        };
        int[][] grid4 = {
                {1},
        };
        int[][] grid5 = {
                {-1, -2, -3},
                {-2, -3, -1},
                {-3, -1, -2},
        };
        int[][] grid6 = {
                {1, 3, 3},
                {3, 1, 2},
                {2, 3, 1},
        };
        int[][] grid7 = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {1, 3, 2, 4},
                {4, 2, 3, 1},
        };
        int[][] grid8 = {
                {0, 3},
                {3, 0},
        };
        int[][] grid9 = {
                {0, 1},
                {1, 0},
        };
        int[][] grid10 = {
                {1, 1, 6},
                {1, 6, 1},
                {6, 1, 1},
        };
        int[][] grid11 = {
                {1, 2, 3, 4},
                {2, 3, 1, 4},
                {3, 1, 2, 4},
                {4, 2, 3, 1},
        };
        int[][] grid12 = {
                {-1, -2, 12, 1},
                {12, -1, 1, -2},
                {-2, 1, -1, 12},
                {1, 12, -2, -1},
        };
        int[][] grid13 = {
                {2, 3, 3},
                {1, 2, 1},
                {3, 1, 2},
        };
        int[][] grid14 = {
                {1, 3},
                {3, 1},
        };
        int[][] grid15 = {
                {2, 3},
                {3, 2},
        };
        int[][] grid16 = {
                {3, 2},
                {2, 3},
        };
        int[][] grid17 = {
                {2, 3, 1},
                {1, 2, 3},
                {2, 3, 1},
        };
        System.out.println(checkConditionMatrix(grid1));
        System.out.println(checkConditionMatrix(grid2));
        System.out.println(checkConditionMatrix(grid3));
        System.out.println(checkConditionMatrix(grid4));
        System.out.println(checkConditionMatrix(grid5));
        System.out.println(checkConditionMatrix(grid6));
        System.out.println(checkConditionMatrix(grid7));
        System.out.println(checkConditionMatrix(grid8));
        System.out.println(checkConditionMatrix(grid9));
        System.out.println(checkConditionMatrix(grid10));
        System.out.println(checkConditionMatrix(grid11));
        System.out.println(checkConditionMatrix(grid12));
        System.out.println(checkConditionMatrix(grid13));
        System.out.println(checkConditionMatrix(grid14));
        System.out.println(checkConditionMatrix(grid15));
        System.out.println(checkConditionMatrix(grid16));
        System.out.println(checkConditionMatrix(grid17));
    }




}
