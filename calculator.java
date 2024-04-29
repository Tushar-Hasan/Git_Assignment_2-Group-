import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                return;
        }

        System.out.println("Result: " + result);
    }

    

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    
    public static double subtract(double x, double y) {
        return x - y;
    }
    public static double divide(double x, double y) {
        return x/y;
    }

}
//new
