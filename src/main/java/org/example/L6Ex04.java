package org.example;

public class L6Ex04 {
    private static void matrixMultiplication() {
        double[][] newMatrix = new double[2][2];

        System.out.println("Enter the first matrix:");
        double[][] m1 = MatrixReceiver.receiver(2, 2);

        System.out.println("Enter the second matrix:");
        double[][] m2 = MatrixReceiver.receiver(2, 2);

        System.out.println("New Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j ++) {
                for (int k = 0; k < 2; k++) {
                    newMatrix[i][j] += m1[i][k] * m2[k][j];
                }

                System.out.printf("%.1f ", newMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrixMultiplication();
    }

}
