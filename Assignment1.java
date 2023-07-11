import java.util.Scanner;

public class SumOfFive {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Declare variables to store the sum and the five integers
        int sum = 0;
        int num1, num2, num3, num4, num5;

        // Prompt the user to input five integers
        System.out.println("Please enter five integers:");

        // Read the five integers and add them to the sum
        num1 = sc.nextInt();
        sum += num1;

        num2 = sc.nextInt();
        sum += num2;

        num3 = sc.nextInt();
        sum += num3;

        num4 = sc.nextInt();
        sum += num4;

        num5 = sc.nextInt();
        sum += num5;

        // Close the scanner
        sc.close();

        // Display the sum of the five integers
        System.out.println("The sum of the five integers is: " + sum);
    }
}
