package com.foxmula.assignment1;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(55, 700, 293);
        Time time2 = new Time(43, 233, 5000);

        time1.add(time2);

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        MenuForStackOperations(stack1, stack2);

        CartesianCoordinate p1 = new CartesianCoordinate();
        CartesianCoordinate p2 = new CartesianCoordinate();
        CartesianCoordinate p3 = new CartesianCoordinate();
        CartesianCoordinate p4 = new CartesianCoordinate();

        GenerateCoordinate(p1, p2, p3, p4);
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 5);

        GenerateCoordinate(p1, p2, p3, p4);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4, 5.3);

        GenerateCoordinate(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4, 8);

        GenerateCoordinate(p1, p2, p3, p4);
        Square square = new Square(p1, p2, p3, p4, 3);

        System.out.println(trapezoid.area() + "is the area of trapezoid");
        System.out.println(parallelogram.area() + "is the area of parallelogram");
        System.out.println(rectangle.area() + "is the area of rectangle");
        System.out.println(square.area() + "is the area of square");
    }

    public static void MenuForStackOperations(Stack stack1, Stack stack2) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1 to perform push() on Stack1");
            System.out.println("2 to perform push() on Stack2");
            System.out.println("\n3 to perform pop() on Stack1");
            System.out.println("4 to perform pop() on Stack2");
            System.out.println("\n5 to check if Stack1 is empty");
            System.out.println("6 to check if Stack2 is empty");
            System.out.println("\n0 to exit");
            System.out.print("Your Choice: ");

            int input = Integer.parseInt(scan.nextLine());

            if (input == 0) {
                break;
            }
            if (input == 1) {
                System.out.print("Enter a number to push() in Stack1: ");
                int number = Integer.parseInt(scan.nextLine());
                stack1.push(number);
            }
            if (input == 2) {
                System.out.print("Enter a number to push() in Stack2: ");
                int number = Integer.parseInt(scan.nextLine());
                stack2.push(number);
            }
            if (input == 3) {
                try {
                    System.out.println(stack1.pop());
                } catch (NoSuchElementException exp) {
                    System.out.println("Stack is empty please push first");
                    continue;
                }
            }
            if (input == 4) {
                try {
                    System.out.println(stack2.pop());
                } catch (NoSuchElementException exp) {
                    System.out.println("Stack is empty please push first");
                    continue;
                }
            }
            if (input == 5) {
                System.out.println(stack1.isEmpty());
            }
            if (input == 6) {
                System.out.println(stack2.isEmpty());
            }

            if (AreStacksEqual(stack1, stack2)) {
                System.out.println("Stacks are equal after this operation, there length is: " + stack1.length());
            }
        }
    }

    public static boolean AreStacksEqual(Stack stack1, Stack stack2) {
        return (stack1.length() == stack2.length());
    }

    public static void GenerateCoordinate(CartesianCoordinate p1, CartesianCoordinate p2, CartesianCoordinate p3, CartesianCoordinate p4) {
        Random random = new Random();

        double randomMax = 10.0;
        double randomMin = 1.0;
        double[] randomDouble = new double[8];

        for (int i = 0; i < 8; i++) {
            randomDouble[i] = randomMin + (randomMax - randomMin) * random.nextDouble();
        }

        p1.setX(randomDouble[0]);
        p2.setY(randomDouble[1]);

        p2.setX(randomDouble[2]);
        p2.setY(randomDouble[3]);

        p3.setX(randomDouble[4]);
        p3.setY(randomDouble[5]);

        p4.setX(randomDouble[6]);
        p4.setY(randomDouble[7]);
    }
}
