package org.example;

public class MatrixReceiver {

    public static double[][] receiver(int row, int col) {
        double[][] numbers = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = GetNumber.getNumber(i, j);
            }
        }

        return numbers;
    }
}
