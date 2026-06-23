import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine(); // clear the buffer
                double fahrenheit = (celsius * 9.0 / 5.0) + 32; // F = (C * 9/5) + 32
                System.out.println(celsius + " C = " + fahrenheit + " F");
                done = true;
            }
            else
            {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid input! Please enter a number.");
            }

        }while(!done);
    }
}