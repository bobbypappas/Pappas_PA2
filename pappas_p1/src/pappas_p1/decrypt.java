package pappas_p1;
import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int digit1, digit2, digit3, digit4, temp1, temp2;
		
		System.out.printf("Enter each digit followed by a space  ex. (1 2 3 4): ");
		
		digit1 = scnr.nextInt();
		
		if (digit1 < 7) 
			digit1 = (digit1 + 10 - 7);
		else 
			digit1 = (digit1 - 7);
		
		digit2 = scnr.nextInt();
		
		if (digit2 < 7) 
			digit2 = (digit2 + 10 - 7);
		else 
			digit2 = (digit2 - 7);
		
		digit3 = scnr.nextInt();
		
		if (digit3 < 7) 
			digit3 = (digit3 + 10 - 7);
		else 
			digit3 = (digit3 - 7);
		temp1 = digit3;
		
		digit4 = scnr.nextInt();
		
		if (digit4 < 7) 
			digit4 = (digit4 + 10 - 7);
		else 
			digit4 = (digit4 - 7);
		
		temp2 = digit4;
		digit3 = digit1;
		digit1 = temp1;
		digit4 = digit2;
		digit2 = temp2;
		
		System.out.printf("%d %d %d %d", digit1, digit2, digit3, digit4);
	}
}
