package pappas_p3;
import java.util.Scanner;

public class pollingProgram 
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int responses[][] = new int [5][10];
		String topics[] = new String [5];
		double avgResponses;
		double [] totVal = new double[5];
		
		topics[0] = "Video games";
		topics[1] = "Political Issues";
		topics[2] = "Global environmental issues";
		topics[3] = "Local environmental issues";
		topics[4] = "Food";
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Rate the following topics from 1-10: ");
			for (int j = 0; j < 5; j++) 
			{
				System.out.println(topics[j]);
				responses[j][i] = scnr.nextInt();
			}
		}
		
		for (int j = 0; j < 5; j++) 
		{
			System.out.print(topics[j] + " ");
			avgResponses = 0;
			for (int i = 0; i < 10; i++) 
			{
				System.out.print(responses[j][i] + " ");
				avgResponses += responses[j][i];
			}
			System.out.printf("%.2f\n", avgResponses / 10);
			totVal[j] = avgResponses;
		}
		
		double max = 0;
		int maxInd = 0;
		double min = Integer.MIN_VALUE;
		int minInd = 0;

		for (int i = 0; i < 5; i++)
		{
		    if (max > totVal[i])
		    {
		        maxInd = i;
		        max = totVal[i];
		    }
		    if (min < totVal[i])
		    {
		        minInd = i;
		        min = totVal[i];
		    }
		}

		System.out.println("Highest points: " +  topics[maxInd] + " : " + max);
		System.out.println("Lowest points: " +  topics[minInd] + " : " + min);
	}
	
}
