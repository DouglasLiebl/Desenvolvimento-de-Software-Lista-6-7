package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L7Ex03 {

    private static void getNumber(int n) throws Exception {
        Scanner input = new Scanner(System.in);
        if (n <= 0 || n > 3) throw new Exception("Invalid option. Breaking...");

        switch (n) {
            case 1 -> doCircle(input);
            case 2 -> doTriangle(input);
            case 3 -> doRectangle(input);
            default -> getNumber(0);
        }
    }

    private static void doCircle(Scanner input) {
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        double area = (Math.pow(radius, 2)) * 3.14;
        double perimeter = (2 * 3.14) * radius;

        System.out.printf("""
                Area: %.1f\s
                Perimeter: %.1f
                """, area, perimeter);
    }

    private static void doTriangle(Scanner input) {
        double[] sides = new double[3];
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("Enter side %d:", (i + 1));
            sides[i] = input.nextDouble();
        }

        double area;

        if (sides[0] == sides[1] && sides[0] == sides[2] && sides[1] == sides[2]) {
            area = ((Math.pow(sides[0], 2)) * 1.7) / 4;

        } else if (sides[0] != sides[1] && sides[0] != sides[2] && sides[1] != sides[2]) {

            System.out.println("Please enter the height of the triangle:");
            double h = input.nextDouble();

            System.out.println("Now enter base value:");
            double b = input.nextDouble();

            area = (b * h) / 2;

        } else {

            double a = 0, b = 0;
            if (sides[0] == sides[1]) {
                a = sides[0];
                b = sides[2] / 2;
            } else if (sides[0] == sides[2]) {
                a = sides[0];
                b = sides[1] / 2;
            } else {
                a = sides[1];
                b = sides[0] / 2;
            }

            double h = Math.pow(a, 2) + Math.pow(b, 2);
            h = Math.sqrt(h);

            area = (b * h) / 2;
        }

        double perimeter = Arrays.stream(sides).sum();

        System.out.printf("""
                Area: %.1f\s
                Perimeter: %.1f
                """, area, perimeter);
    }
    private static void doRectangle(Scanner input) {
        double[] sides = new double[2];

        System.out.println("Enter the firs side value:");
        sides[0] = input.nextDouble();

        System.out.println("Enter the second side value:");
        sides[1] = input.nextDouble();

        double area = sides[0] * sides[1];
        double perimeter = (Arrays.stream(sides).sum()) * 2;

        System.out.printf("""
                Area: %.1f\s
                Perimeter: %.1f
                """, area, perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("""
                    Chose a option:
                    [1] Circle\s
                    [2] Triangle\s
                    [3] Rectangle\s
                    Enter a number:
                    """);
            getNumber(input.nextInt());

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only integers are allowed");
            System.out.println(e.getMessage());
        }
    }
}



