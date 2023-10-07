package org.example;

public class L6Ex05 {

    private static void matrixPotentiation() {
        double[][] newMatrix = new double[3][3];

        System.out.println("Enter the matrix:");
        double[][] matrix = MatrixReceiver.receiver(3, 3);

        System.out.println("New Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j ++) {
                for (int k = 0; k < 3; k++) {
                    newMatrix[i][j] += matrix[i][k] * matrix[k][j];
                }

                System.out.printf("%.1f ", newMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrixPotentiation();
    }
}
