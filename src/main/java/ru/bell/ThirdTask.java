package ru.bell;

public class ThirdTask {
    public static void main(String[] args) {
        int[][] firstMatrix = fillFirstMatrix(4, 4);
        printMatrix(firstMatrix);

        int[][] secondMatrix = fillSecondMatrix(6, 6);
        printMatrix(secondMatrix);

        int[][] matrix3 = fillThirdMatrix(8, 8);
        printMatrix(matrix3);
    }

    public static int[][] fillFirstMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static int[][] fillSecondMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    matrix[i][j] = 2;
                } else if (i == 1 || i == rows - 2 || j == 1 || j == cols - 2) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static int[][] fillThirdMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    matrix[i][j] = 3;
                } else if (i == 1 || i == rows - 2 || j == 1 || j == cols - 2) {
                    matrix[i][j] = 2;
                } else if (i == 2 || i == rows - 3 || j == 2 || j == cols - 3) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}