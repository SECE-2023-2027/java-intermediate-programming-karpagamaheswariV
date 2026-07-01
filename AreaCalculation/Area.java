package AreaCalculation;
import java.util.Scanner;

class AreaCalculator {

    // Circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Square
    public static double calculateArea(int side) {
        return side * side;
    }
}

public class Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Circle Radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter Rectangle Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Rectangle Width: ");
        double width = sc.nextDouble();

        System.out.print("Enter Square Side: ");
        int side = sc.nextInt();

        System.out.println("Circle Area: " + AreaCalculator.calculateArea(radius));
        System.out.println("Rectangle Area: " + AreaCalculator.calculateArea(length, width));
        System.out.println("Square Area: " + AreaCalculator.calculateArea(side));

        sc.close();
    }
}