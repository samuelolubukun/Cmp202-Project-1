package Physicsoop;
import UI.EnergyUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnergyUI EngUI = new  EnergyUI();
        EngUI.MainUI();

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

                case 2:
                    System.out.println("Enter the mass (in kg):");
                    mass = input.nextFloat();
                    System.out.println("Enter the velocity (in m/s):");
                    float velocity = input.nextFloat();
                    result = myObj.calculateKineticEnergy(mass, velocity);
                    break;

                case 3:
                    System.out.println("Enter the force (in N):");
                    float force = input.nextFloat();
                    System.out.println("Enter the distance (in meters):");
                    float distance = input.nextFloat();
                    result = myObj.calculateWork(force, distance);
                    break;

                case 4:
                    System.out.println("Enter the work (in J):");
                    float work = input.nextFloat();
                    System.out.println("Enter the time (in seconds):");
                    float time = input.nextFloat();
                    result = myObj.calculatePower(work, time);
                    break;
                case 5:
                    System.out.println("Enter the initial velocity (in m/s):");
                    float initialVelocity = input.nextFloat();
                    System.out.println("Enter the acceleration (in m/s^2):");
                    float acceleration = input.nextFloat();
                    System.out.println("Enter the time (in seconds):");
                    time = input.nextFloat();
                    result = myObj.calculateFinalVelocity (initialVelocity, acceleration, time);
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
