import java.util.Scanner;

public class IT24102907Lab5Q3 {
  
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int DISCOUNT_RATE_3_TO_4_DAYS = 10;
    private static final int DISCOUNT_RATE_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start date and end date
        System.out.print("Enter the start date of the reservation (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date of the reservation (1-31): ");
        int endDate = scanner.nextInt();

        // Validate the input dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
        } else {
            // Calculate the number of days reserved
            int numberOfDays = endDate - startDate;

            // Determine the discount rate
            int discountRate = 0;
            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discountRate = DISCOUNT_RATE_3_TO_4_DAYS;
            } else if (numberOfDays >= 5) {
                discountRate = DISCOUNT_RATE_5_OR_MORE_DAYS;
            }

            // Calculate the total amount
            double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
            double discount = totalAmount * discountRate / 100;
            double finalAmount = totalAmount - discount;

            // Display results
            System.out.println("Number of days reserved: " + numberOfDays);
            System.out.println("Total amount before discount: Rs " + totalAmount);
            System.out.println("Discount: Rs " + discount);
            System.out.println("Total amount to be paid: Rs " + finalAmount);
        }

        scanner.close();
    }
}
