 import java.util.Scanner;

public class MethodsArrays {

    // Method to calculate sum
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Method to display array elements
    public static void displayArray(int[] arr) {
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = calculateSum(num1, num2);
        System.out.println("Sum = " + sum);

        // Array example
        int[] numbers = {10, 20, 30, 40, 50};
        displayArray(numbers);

        sc.close();
    }
}
