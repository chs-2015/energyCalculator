/**
 * Author: Brandon B.
 * Date: 9-2-15
 */
 
import java.util.Scanner;
public class energyCalculator {
    
    public static void main(String[] args) {
    	// Set up our variables and scanner
    	double mass, velocity, kineticEnergy, momentum;
    	Scanner requestInput = new Scanner(System.in);

		// Request input from the user
		System.out.print("Mass (kg): ");
		mass = requestInput.nextDouble();

		System.out.print("Velocity (m/s): ");
		velocity = requestInput.nextDouble();

		// Do freshmen-year science!!
		kineticEnergy = (0.5) * mass * Math.pow(velocity, 2);
		momentum = mass * velocity;
		
		// Print out garbage
		System.out.println("\nMass: " + mass + " kg");
		System.out.println("Velocity: " + velocity + " m/s\n");
		System.out.println("Momentum: " + momentum + "  kg m/s");
		System.out.println("Kinetic Energy: " + kineticEnergy + " Joules");
    }
}
