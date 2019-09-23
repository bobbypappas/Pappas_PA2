package pappas_p2;
import java.util.Scanner;

public class BodyBmi {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int calcDecider;
		double bmi;
		double heightInches;
		double heightMeters;
		double weightPounds;
		double weightKilo;
		
		System.out.println("Choose your body mass index calculator.\n");
		System.out.print("Type 1 for metric system or 2 for imperial system: ");
		calcDecider = scnr.nextInt();
		
		if (calcDecider == 1) 
		{
			System.out.printf("\nEnter your height in meters: ");
			heightMeters = scnr.nextDouble();
			System.out.printf("\nEnter your weight in kilograms: ");
			weightKilo = scnr.nextDouble();
			bmi = (weightKilo / (heightMeters * heightMeters));
			System.out.printf("\nYour body mass index is : %.2f\n", bmi);
		}
		else if (calcDecider == 2) 
		{
			System.out.printf("\nEnter your height in inches: ");
			heightInches = scnr.nextDouble();
			System.out.printf("\nEnter your weight in pounds: ");
			weightPounds = scnr.nextDouble();
			bmi = ((703 * weightPounds) / (heightInches * heightInches));
			System.out.printf("\nYour body mass index is: %.2f\n\n", bmi);
		}
		else 
		{
			System.out.printf("\nYou entered an invalid input.");
			System.exit(0);
		}
		
		System.out.println("Underweight =< 18.5\nNormal Weight = 18.5 - 24.9\nOverweight = 25-29.9\nObesity = 30 or greater");
	}

}
