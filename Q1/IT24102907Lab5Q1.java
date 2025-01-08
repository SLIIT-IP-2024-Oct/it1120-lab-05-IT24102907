import java.util.Scanner;

public class IT24102907Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three different integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        // Find the smallest number
        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}
