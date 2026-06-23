import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Operators
        int sum = a + b;
        int product = a * b;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        // Conditional Statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Loop
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}