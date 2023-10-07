package org.example;

public class L6Ex02 {

    private static void numberComparator() {
        double[][] values = new double[4][4];
        int line = 0, column = 0;
        double bigger = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                values[i][j] = GetNumber.getNumber(i, j);
                if (values[i][j] > bigger) {
                    bigger = values[i][j];
                    line = i;
                    column = j;
                }
            }
        }

        System.out.printf("""
                Largest Number in the matrix: %.1f\s
                Line: %d\s
                Column: %d
                """, bigger, line, column);
    }

    public static void main(String[] args) {
        numberComparator();
    }
}
