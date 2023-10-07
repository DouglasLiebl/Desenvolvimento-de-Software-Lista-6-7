package org.example;

import java.util.Scanner;

public class L6Ex03 {

    private static void matrixBuilder() {
        double[][] newMatrix = new double[4][4];

        System.out.println("Enter the first matrix:");
        double[][] m1 = MatrixReceiver.receiver(4, 4);

        System.out.println("Enter the second matrix:");
        double[][] m2 = MatrixReceiver.receiver(4, 4);

        System.out.println("New Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j ++) {
                newMatrix[i][j] = Math.max(m1[i][j], m2[i][j]);
                System.out.printf("%.1f ", newMatrix[i][j]);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        matrixBuilder();
    }
}
