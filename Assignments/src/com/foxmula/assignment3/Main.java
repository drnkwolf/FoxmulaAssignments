package com.foxmula.assignment3;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static int[] inputArray = new int[]{1, 2, 3, 2, 1, 4, 3, 5, 2, 1};

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int input = Integer.parseInt(scan.nextLine());

        try {
            UtilityFunctions.isValid(input);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        UtilityFunctions.frequencyOfElements(inputArray);
    }
}
