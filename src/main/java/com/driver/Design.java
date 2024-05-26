package com.driver;

import java.util.Scanner;

public class Design {
    private String name;
    private String category;
    private String designerUsername;
    private double rating;

    public Design(String name, String category, String designerUsername) {
        if (name == null || name.isEmpty() || category == null || category.isEmpty() || designerUsername == null || designerUsername.isEmpty()) {
            throw new IllegalArgumentException("Name, category, and designer's username must not be null or empty.");
        }

        this.name = name;
        this.category = category;
        this.designerUsername = designerUsername;
        this.rating = 0.0; // Default rating
    }

    public static Design createDesignFromUserInput(String name, String category, String designerUsername, double rating) {
        Design design = new Design(name, category, designerUsername);
        design.setRating(rating);
        return design;
    }

    public void setRating(double rating) {
    	//your code goes here
        this.rating =rating;
    }

    public double getRating() {
    	//your code goes here
        return rating;
    }

    public String getKey() {
    	//your code goes here
        return name + "_" + category + "_" + designerUsername;
    }

    public void displayDesignDetails() {
    	//your code goes here
        System.out.println("Primary Key: " + getKey());
        System.out.println("Rating: " + getRating());
    }

    public double performMathOperation() {
    	//your code goes here
        return 2 * rating;
    }

    public static void main(String[] args) {
    	//your code goes here
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
