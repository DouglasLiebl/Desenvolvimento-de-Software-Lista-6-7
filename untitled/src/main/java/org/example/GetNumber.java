package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {

    public static Double getNumber(Integer index, Integer column) {
        Scanner input = new Scanner(System.in);
        double value = 0;

        try {
            System.out.printf("Enter %dº number of column %d: ", index + 1, column + 1);
            value = input.nextDouble();
        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed.");
            System.out.println(e.getMessage());
            getNumber(index, column);
        }

        return value;
    }
}
