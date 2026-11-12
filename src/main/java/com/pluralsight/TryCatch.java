package com.pluralsight;

import java.util.Scanner;

public class TryCatch {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quoteChoice = 0;

        String[] quotes = {
                "I know you are, but what I am.",
                "Jinkies.",
                "Quoth the Raven.",
        };

        do {
            System.out.println("Please select a number between 1 and 3 for a quote:");
            quoteChoice = Integer.parseInt((scanner.nextLine()));

            try {
                if (quoteChoice == 0) {
                    quoteChoice = (int) (Math.random() * quotes.length) + 1;
                }

                System.out.printf("%d. %s%n%n", quoteChoice, quotes[quoteChoice - 1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                if (quoteChoice != -1) {
                    System.out.println("Please select 1-" + quotes.length + ", 0 for random, or -1 to quit.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        } while (quoteChoice != -1);
        scanner.close();
    }
}