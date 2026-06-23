import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String trash = "";
        boolean done = false;

        // get width
        do
        {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            }
            else
            {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid! Please enter a number.");
            }

        }while(!done);

        done = false; // reset for next input

        // get height
        do
        {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            }
            else
            {
                trash = in.nextLine(); // read bad input as string
                System.out.println("You entered: " + trash);
                System.out.println("Invalid! Please enter a number.");
            }

        }while(!done);

        // calculations
        double area = width * height;                                    // area = width * height
        double perimeter = 2 * (width + height);                        // perimeter = 2 * (width + height)
        double diagonal = Math.sqrt((width * width) + (height * height)); // Pythagorean theorem

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}