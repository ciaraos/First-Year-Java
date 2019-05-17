
/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5: 5
       Comment: I used constants for the highest card and the lowest card as well as the number of guesses allowed
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5: 5
       Comment: I believe the constants are clear and are correctly formatted in UPPERCASE
   3. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 10
       Comment:  I believe the variable names are quite clear and easy to follow
   4. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5: 5
       Comment:  yes, all variable names are in lowerCamelCase
   5. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment:  I believe the code is indented where necessary
   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose? 
       Mark out of 20: 15
       Comment: the user can keep entering their guesses until they win or lose but the loop doesn't take into account if the loser is wrong
   7. Did I check the input to ensure that invalid input was handled appropriately? 
       Mark out of 10: 10
       Comment: if the user enters the wrong input they are asked to type higher, lower or equal
   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)? 
       Mark out of 10: 8
       Comment: i generated the first card correctly but i think the loop compares all the cards to the first
   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King? 
       Mark out of 10: 10
       Comment: i used if statements to output the cards correctly
   10. Did I report whether the user won or lost the game before the program finished? 
       Mark out of 10: 10
       Comment: the program tells the user when the win or lose
   11. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: i tried to comment honestly on my mistakes but my eclipse stopped working so i was unable to test my program
   Total Mark out of 100 (Add all the previous marks): 93
*/
import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class HiLoGame {
	public static final int HIGHEST_CARD = 13;
	public static final int LOWEST_CARD = 2;
	public static final int GUESSES = 4;

	public static void main(String[] args) {
		int count = 0;
		while (count < GUESSES) 
		{
			count++;
			Random generator = new Random();
			int currentCard = generator.nextInt(HIGHEST_CARD + 1);
			currentCard = currentCard + 2;
			Scanner answer = new Scanner(System.in);
			if (currentCard == 11) 
			{
				System.out.println("The card is a Jack");
			} 
			else if (currentCard == 12) 
			{
				System.out.println("The card is a Queen");
			} 
			else if (currentCard == 13) 
			{
				System.out.println("The card is a King");
			} 
			else if (currentCard == 14) 
			{
				System.out.println("The card is an Ace");
			}
			else if (currentCard < 11)
			{
			System.out.println("The card is a " + currentCard);
			}
			System.out.print("Do you think the next card will be higher, lower or equal? ");
			int nextCard = generator.nextInt(HIGHEST_CARD + 1);
			nextCard = nextCard + 2;
			boolean higher = answer.hasNext("higher");
			boolean lower = answer.hasNext("lower");
			boolean equal = answer.hasNext("equal");

			if ((higher && nextCard < currentCard) || (lower && nextCard > currentCard)
					|| (equal && nextCard != currentCard)) 
			{
				System.out.println("The card is a " + nextCard);
				System.out.println("Sorry, you were incorrect, you must guess successfully 4 times in a row to win.");
				count = 4;
			} 
			else if (!higher && !lower && !equal) 
			{
				System.out.println("Invalid input, please type the words 'higher', 'lower' or 'equal' ");
			}
			currentCard = nextCard;

		}
		while (count == GUESSES) 
		{
			System.out.print("Congratulations, you got them all correct!");
		}

	}

}
