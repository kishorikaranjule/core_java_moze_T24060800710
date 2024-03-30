package A;

import java.util.Scanner;

public class MathOperation {
    // Data members
    private double X;
    private double Y;
    private double R;

    // Method to input X and Y from user
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of X: ");
        X = scanner.nextDouble();
        System.out.println("Enter value of Y: ");
        Y = scanner.nextDouble();
    }

    // Method to add X and Y and store in R
    public void add() {
        R = X + Y;
    }

    // Method to multiply X and Y and store in R
    public void multiply() {
        R = X * Y;
    }

    // Method to calculate X to the power of Y and store in R
    public void power() {
        R = Math.pow(X, Y);
    }

    // Method to display the result R
    public void display() {
        System.out.println("Result: " + R);
    }

    public static void main(String[] args) {
        // Create an instance of MathOperation class
        MathOperation mathOperation = new MathOperation();

        // Call methods to perform operations and display result
        mathOperation.init();
        mathOperation.add();
        mathOperation.display();

        mathOperation.multiply();
        mathOperation.display();

        mathOperation.power();
        mathOperation.display();
    }
}
