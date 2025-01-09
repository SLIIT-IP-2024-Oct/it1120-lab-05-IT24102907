import java.util.Scanner;

public class IT24102907Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of new members introduced by the customer
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate the input
        if (newMembers < 0) {
            System.out.println("Invalid input. Number of new members cannot be negative.");
        } else {
            String prize;

            // Determine the prize using a switch statement
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default: // for 5 or more
                    prize = "Headphone";
                    break;
            }

            // Print the prize
            System.out.println("Prize: " + prize);
        }

        scanner.close();
    }
}
