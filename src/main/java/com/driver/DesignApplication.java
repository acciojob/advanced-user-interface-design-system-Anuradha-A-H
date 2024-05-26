package com.driver;

import java.util.Scanner;

public class DesignApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter design name: ");
            String name = scanner.nextLine();

            System.out.print("Enter design category: ");
            String category = scanner.nextLine();

            System.out.print("Enter designer's username: ");
            String designerUsername = scanner.nextLine();

            System.out.print("Enter design rating: ");
            double rating = scanner.nextDouble();

            Design design = Design.createDesignFromUserInput(name, category, designerUsername, rating);

            design.displayDesignDetails();

            double updatedRating = design.performMathOperation();
            System.out.println("Updated rating after mathematical operation: " + updatedRating);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}

