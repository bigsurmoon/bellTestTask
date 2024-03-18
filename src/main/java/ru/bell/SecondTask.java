package ru.bell;

public class SecondTask {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        int minDiagonalElement = findMinDiagonalElement(array);
        System.out.println("Минимальный элемент диагонали: " + minDiagonalElement);
    }

    public static int findMinDiagonalElement(int[][] array) {
        int min = Integer.MAX_VALUE;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && j != n - 1 - i) {
                    min = Math.min(min, array[i][j]);
                }
            }
        }
        return min;
    }
}