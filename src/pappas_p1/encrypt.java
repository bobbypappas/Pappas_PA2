package pappas_p1;
import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int digit1, digit2, digit3, digit4, temp1, temp2;
		
		System.out.printf("Enter each digit followed by a space  ex. (1 2 3 4): ");
		
		digit1 = scnr.nextInt();
		digit1 = ((digit1 + 7) % 10);
		temp1 = digit1;
		
		digit2 = scnr.nextInt();
		digit2 = ((digit2 + 7) % 10);
		temp2 = digit2;
		
		digit3 = scnr.nextInt();
		digit3 = ((digit3 + 7) % 10);
		
		digit4 = scnr.nextInt();
		digit4 = ((digit4 + 7) % 10);
		
		digit1 = digit3;
		digit3 = temp1;
		digit2 = digit4;
		digit4 = temp2;
		
		System.out.printf("%d %d %d %d", digit1, digit2, digit3, digit4);
	}
}
