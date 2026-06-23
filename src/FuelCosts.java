import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        // get gallons
        do {
            System.out.print("Enter gallons of gas in tank: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid input! Please enter a number.");
            }

        } while (!done);

        done = false; // reset for next input

        // get mpg
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid input! Please enter a number.");
            }

        } while (!done);

        done = false; // reset for next input

        // get price per gallon
        do {
            System.out.print("Enter price of gas per gallon: ");

            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid input! Please enter a number.");
            }

        } while (!done);

        // calculations
        double costPer100Miles = (100.0 / mpg) * pricePerGallon; // cost = (miles / mpg) * price
        double totalRange = gallons * mpg; // range = gallons * mpg

        System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
        System.out.println("Total range on a full tank: " + totalRange + " miles");
    }
}