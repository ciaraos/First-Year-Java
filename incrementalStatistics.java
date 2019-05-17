
/* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 9 (not sure)
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5: 5
   3. Did I indent the code appropriately? 
       Mark out of 10: 10
   4. Did I input the numbers one at a time from the command line?
       Mark out of 10:  10
   5. Did I check the input to ensure that invalid input was handled appropriately?
       Mark out of 10:  10
   6. Did I use an appropriate while or do-while loop to allow the user to enter numbers until they entered exit/quit?
       Mark out of 20:  20
   7. Did I implement the loop body correctly so that the average and variance were updated and output appropriately?
       Mark out of 30:  30
   8. How well did I complete this self-assessment? 
       Mark out of 5: 5
   Total Mark out of (Add all the previous marks): 99
*/

import java.util.Scanner;

public class incrementalStatistics {

	public static void main(String[] args) {
		double numberCount = 0;
		double average = 0.0;
		double variance = 0.0;
		double averagePrev = 0;
		double variancePrev = 0;
		double numberPrev = 0;
		boolean finished = false;

		System.out.print("Enter a number (or type 'exit'): ");
		while (!finished) 
		{
			Scanner numberInput = new Scanner(System.in);
			if (numberInput.hasNextDouble()) 
			{
				numberCount++;
				averagePrev = average;
				variancePrev = variance;
				double currentNumber = numberInput.nextDouble();
				average = averagePrev + (currentNumber - averagePrev) / numberCount;
				variance = ((variancePrev * (numberCount - 1))
						+ (currentNumber - averagePrev) * (currentNumber - average)) / numberCount;
				System.out.println("So far the average is " + average + " and the variance is " + variance);
				System.out.print("Enter another number (or type 'exit'): ");
			} 
			else if (numberInput.hasNext("exit")) 
			{
				finished = true;
				System.out.println("Goodbye");
			} 
			else
			{
				System.out.print("Invalid input, enter another number (or type 'exit'): ");
			}
		}
	}
}
