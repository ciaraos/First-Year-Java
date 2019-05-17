/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
        Mark out of 5:  5, i believe they are easy to understand and they're in lowerCamelCase
 2. Did I indent the code appropriately?
        Mark out of 5: 5, i indented the code where necessary
 3. Did I write the initialiseHighScores function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 15: 15, i used parameters, return types and a function body
 4. Did I write the printHighScores function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 15: 10, i believe there is some error in invoking it as it prints the high scores separately
 5. Did I write the higherThan function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 15: 15, the function ensures that the numbers are printed in the correct order
 6. Did I write the insertScore function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 20: 20, i believe i did this correctly 
 7. Did I write the main function body correctly (first asking for the number of scores to be maintained and then repeatedly asking for scores)?
       Mark out of 20: 15, i may have made an error here printing out the high scores 
 8. How well did I complete this self-assessment?
        Mark out of 5: 5, i took away marks where i felt appropriate
 Total Mark out of 100 (Add all the previous marks): 90
*/ 
import java.util.Scanner;

public class HighScores {
	public static void userInput() 
	{
		boolean finished = false;

		System.out.print("How many scores do you want to keep? ");
		Scanner inputScanner = new Scanner(System.in);
		int howMany = inputScanner.nextInt();
		int[] highScoresArray = new int[howMany];
		initialiseHighScore(highScoresArray);
		System.out.print("Please enter your high scores (or type 'exit')");
		int score = inputScanner.nextInt();
		while (!finished) 
		{
			if (inputScanner.hasNextInt()) 
			{
				if (higherThan(score, highScoresArray)) 
				{
					insertScore(highScoresArray, score);
				}
				printHighScores(highScoresArray);
				System.out.print("\nEnter another high score? (or type 'exit') ");
				score = inputScanner.nextInt();
			} 
			else if (inputScanner.hasNext("exit")) 
			{
				finished = true;
				inputScanner.close();
				System.out.print("Goodbye");
			} 
			else if(score <= 0 && howMany <= 0) 
			{ 
				System.out.print("Invalid input, please enter a whole positive number e.g 567 ");
				inputScanner.next(); 
			}
			else 
			{
				System.out.print("Invalid input, please enter a whole, positive number e.g 100 ");
				inputScanner.next();
			}
		}
	}

	public static int[] initialiseHighScore(int[] highScoresArray) 
	{
		// initialiseHighScores () which sets all high scores to zero.
		for (int index = 0; index < highScoresArray.length; index++) 
		{
			highScoresArray[index] = 0;
		}
		return highScoresArray;
	}

	public static void printHighScores(int[] highScoresArray) 
	{
		/* printHighScores() which prints the high scores in the format:
		   “The high scores are 345, 300, 234”, for all existing high scores in the list
		   (remember that sometimes it won’t be full).*/
		if (highScoresArray != null) 
		{
			System.out.println("The high scores are: ");
			for (int index = 0; index < highScoresArray.length; index++) 
			{
				System.out.println((index + 1) + ". " + highScoresArray[index]);
			}
		}

	}

	public static boolean higherThan(int score, int[] highScoresArray)
	/* higherThan() which takes the high scores and a new score and returns whether
	   the passed score is higher than any of those in the high score list.*/
	{
		boolean higherThan = false;
		int index = 0;
		while (index < highScoresArray.length && higherThan != true) 
		{
			if (score > highScoresArray[index]) 
			{
				higherThan = true;
			}
			index++;
		}
		return higherThan;
	}

	public static void insertScore(int[] highScoresArray, int score) 
	{
		/* insertScore() which takes the current high score list and a new score and
		updates it by inserting the new score at the appropriate position in the list*/
		int index = 0;
		while (index < highScoresArray.length)  
		{
			if (highScoresArray[index] < score) 
			{
				int nextScore = highScoresArray[index];
				highScoresArray[index] = score;
				score = nextScore;
			}
			index++;
		}
	}

	public static void main(String[] args) {
		userInput();

	}

}