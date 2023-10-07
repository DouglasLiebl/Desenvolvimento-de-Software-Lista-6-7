package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L7Ex02 {

    private static void noteGetter(Scanner input) throws Exception {
        double[] notes = new double[3];

        for (int i = 0; i < notes.length; i ++) {
            System.out.printf("Enter note %d: ", (i + 1));
            notes[i] = input.nextDouble();

            if (notes[i] > 10 || notes[i] < 0) throw new Exception("Negative numbers or numbes greater tha 10 are not accepted.");
        }

        double average = Arrays.stream(notes).average().getAsDouble();

        resultPrinter(average);
    }

    private static void resultPrinter(Double note) {
        String response;

        if (note >= 4 && note <= 6) response = "Exam";
        else if (note > 6) response = "Approved";
        else response = "Reproved";

        System.out.println(response);
    }



    public static void main(String[] args) {
        try {
            noteGetter(new Scanner(System.in));
        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed. Breaking...");
            System.out.println(e.getMessage());
        }
    }
}
