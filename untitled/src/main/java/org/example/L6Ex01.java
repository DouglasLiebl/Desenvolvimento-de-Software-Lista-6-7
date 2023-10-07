package org.example;

public class L6Ex01 {

    private static void numberComparator() {
        double[][] values = new double[4][4];
        double bigger = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                values[i][j] = GetNumber.getNumber(i, j);
                if (values[i][j] > bigger) bigger = values[i][j];
            }
        }

        System.out.println("Largest number in the matrix: " + bigger);
    }

    public static void main(String[] args) {
        numberComparator();
    }
}
