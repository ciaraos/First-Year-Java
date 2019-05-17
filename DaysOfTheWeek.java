
/* SELF ASSESSMENT
 1. Did I use appropriate, easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
        Mark out of 5: 5
        comment: i believe these are easy to understand and they are in UPPERCASE 
 2. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
        Mark out of 5:  5
        comment: i believe these were easy to understand and formatted correctly in lowerCamelCase
 3. Did I indent the code appropriately?
        Mark out of 5: 5
        comment: i indented so the code was easy to follow
 4. Did I define the required function correctly (names, parameters & return type) and invoke them correctly?
       Mark out of 20: 20
       comment: i believe i defined and invoked the functions correctly
 5. Did I implement the dayOfTheWeek function correctly and in a manner that can be understood?
       Mark out of 20: 15
       comment: i think the function was implemented correctly but i am uncertain as to how easy to understand it is
 6. Did I implement the other functions correctly, giving credit for any code that you take from elsewhere?
       Mark out of 20: 20
       comment: i used examples from blackboard to help implement the other functions
 7. Did I obtain (and process) the input from the user in the correct format (dd/mm/yyyy), 
 	and deal with any invalid input properly?       
 	Mark out of 10: 10
 	comment: i used try catch exceptions to deal with invalid input
 8. Does the program produce the output in the correct format (e.g. Monday, 25th December 2017)?
       Mark out of 10: 10
       comment: i think the program outputs correctly 
 9. How well did I complete this self-assessment?
        Mark out of 5: 5
 Total Mark out of 100 (Add all the previous marks):95
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DaysOfTheWeek {
	public static final int MAX_DAYS_SEP_APRIL_JUNE_NOV = 30;
	public static final int FEB_LEAP_YEAR = 29;
	public static final int FEB_USUALLY = 28;
	public static final int USUAL_MAX_DAYS = 31;
	public static final int MAX_NUMBER_OF_MONTHS = 12;
	public static final int MIN_NUMBER_OF_MONTHS = 1;

	public static boolean validDate(int day, int month, int year) 
	{
		return ((year > 0) && (month >= MIN_NUMBER_OF_MONTHS) && (month <= MAX_NUMBER_OF_MONTHS) 
				&& (day >= 1) && (day <= daysInMonth(month, year)));
	}

	public static int daysInMonth(int month, int year) 
	{
		int numberOfDays = USUAL_MAX_DAYS;
		switch (month) 
		{
		case 2:
			numberOfDays = leapYear(year) ? FEB_LEAP_YEAR : FEB_USUALLY;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays = MAX_DAYS_SEP_APRIL_JUNE_NOV;
			break;
		default:
			numberOfDays = USUAL_MAX_DAYS;
			break;
		}
		return numberOfDays;
	}

	public static String numberEnding(int day) 
	{
		String suffix = "";
		if (((day % 100) / 10) == 1) 
		{
			suffix = "th";
		} 
		else 
		{
			switch (day % 10) 
			{
			case 1:
				suffix = "st";
				break;
			case 2:
				suffix = "nd";
				break;
			case 3:
				suffix = "rd";
				break;
			default:
				suffix = "th";
				break;
			}
		}
		return suffix;
	}

	public static String monthName(int month) 
	{
		String monthOutput = "";
		switch (month) 
		{
		case 1:
			monthOutput = "January";
			break;
		case 2:
			monthOutput = "February";
			break;
		case 3:
			monthOutput = "March";
			break;
		case 4:
			monthOutput = "April";
			break;
		case 5:
			monthOutput = "May";
			break;
		case 6:
			monthOutput = "June";
			break;
		case 7:
			monthOutput = "July";
			break;
		case 8:
			monthOutput = "August";
			break;
		case 9:
			monthOutput = "September";
			break;
		case 10:
			monthOutput = "October";
			break;
		case 11:
			monthOutput = "November";
			break;
		case 12:
			monthOutput = "December";
			break;
		}
		return monthOutput;
	}

	public static final String dayOfTheWeek(int day, int month, int year) 
	{
		int Y = year;
		if ((month == 1) || (month == 2)) 
		{
			Y = year - 1;
		}

		int y = Y % 100;
		int c = Y / 100;
		int dayOfTheWeek = (int) ((day + Math.floor(2.6 * (((month + 9) % 12) + 1) - 0.2) + y
				+ Math.floor((y / 4) + Math.floor(c / 4) - Math.floor(2 * c))) % 7);
		if (dayOfTheWeek < 0) 
		{
			dayOfTheWeek = dayOfTheWeek + 7;
		}
		String dayOutput = "";
		switch (dayOfTheWeek) 
		{
		case 0:
			dayOutput = "Sunday";
			break;
		case 1:
			dayOutput = "Monday";
			break;
		case 2:
			dayOutput = "Tuesday";
			break;
		case 3:
			dayOutput = "Wednesday";
			break;
		case 4:
			dayOutput = "Thursday";
			break;
		case 5:
			dayOutput = "Friday";
			break;
		case 6:
			dayOutput = "Saturday";
			break;
		}

		return dayOutput;
	}

	public static boolean leapYear(int year) 
	{
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	public static void userInput() 
	{
		try {
			String inputByUser = JOptionPane.showInputDialog("Enter a date in the form (DD/MM/YEAR) ");
			Scanner userInput = new Scanner(inputByUser);
			userInput.useDelimiter("/");
			int day = userInput.nextInt();
			int month = userInput.nextInt();
			int year = userInput.nextInt();
			String displayMonth = monthName(month);
			String displayDay = dayOfTheWeek(day, month, year);
			String displaySuffix = numberEnding(day);
			JOptionPane.showMessageDialog(null,
					displayDay + ", " + day + displaySuffix + " " + displayMonth + ", " + year);
		} 
		catch (NullPointerException exception) 
		{
		} 
		catch (java.util.NoSuchElementException exception) 
		{
			JOptionPane.showMessageDialog(null,
					"Invalid input, please enter another date in the form " + "DD/MM/YEAR e.g Friday, 24/11/2017");
		}

	}

	public static void main(String[] args) {
		userInput();
	}

}
