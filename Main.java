import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Energy myObj = new Energy();
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose an operation:");
        System.out.println("1. Calculate potential energy");
        System.out.println("2. Calculate kinetic energy");
        System.out.println("3. Calculate work");
        System.out.println("4. Calculate power");
        System.out.println("5. Calculate final velocity");

        try {
            int choice = input.nextInt();
            float result = 0;

            switch (choice) {
                case 1:
                    System.out.println("Enter the mass (in kg):");
                    float mass = input.nextFloat();
                    System.out.println("Enter the height (in meters):");
                    float height = input.nextFloat();
                    result = myObj.calculatePotentialEnergy(mass, height);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
