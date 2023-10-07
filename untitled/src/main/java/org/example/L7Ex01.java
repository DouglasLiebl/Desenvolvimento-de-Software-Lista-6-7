package org.example;

import java.awt.image.ImagingOpException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L7Ex01 {

    private static void determineMonths(Integer month) {

        HashMap<Integer, String> months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        System.out.printf("Month: %s", months.get(month));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the month:");
            int month = input.nextInt();

            determineMonths(month);

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only integers are allowed. Breaking...");
            System.out.println(e.getMessage());
        }
    }
}
