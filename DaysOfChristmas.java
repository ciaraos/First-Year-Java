/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5: 5
       comment: i used a constant for each differing line
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5: 5
       comment: yes, they are all in UPPERCASE
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)? 
       Mark out of 10: 10
       comment: i used one variable, day, and it's in lowerCamelCase
   4. Did I indent the code appropriately? 
       Mark out of 10: 10
       comment: i indented after each loop
   5. Did I use an appropriate loop (or loops) to produce the different verses? 
       Mark out of 20:  20
       comment: i used to switch statements and a for loop
   6. Did I use a switch to build up the verses? 
       Mark out of 25:  25
       comment: yes, i used switch statements for the days and lyrics
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))? 
       Mark out of 10:  10
       comment: i used constants and switch statements
   8. Does the program produce the correct output? 
       Mark out of 10:  10
       comment: it prints out the full lyrics
   9. How well did I complete this self-assessment? 
       Mark out of 5: 5
   Total Mark out of 100 (Add all the previous marks): 100
*/
public class DaysOfChristmas {
	public static final int DAYS = 12;
	public static final String DAY1 = " A Partridge in a Pear Tree";
	public static final String DAY2 = " Two Turtle Doves and";
	public static final String DAY3 = " Three French Hens";
	public static final String DAY4 = " Four Calling Birds";
	public static final String DAY5 = " Five Golden Rings";
	public static final String DAY6 = " Six Geese a Laying";
	public static final String DAY7 = " Seven Swans a Swimming";
	public static final String DAY8 = " Eight Maids a Milking";
	public static final String DAY9 = " Nine Ladies Dancing";
	public static final String DAY10 = " Ten Lords a Leaping";
	public static final String DAY11 = " Eleven Pipers Piping";
	public static final String DAY12 = " Twelve Drummers Drumming";

	public static void main(String[] args) {

		for (int day = 1; (day <= DAYS); day++) 
		{
			System.out.print("\n On the ");
			switch (day) 
			{
			case 12:
				System.out.print("twelfth");
				break;
			case 11:
				System.out.print("eleventh");
				break;
			case 10:
				System.out.print("tenth");
				break;
			case 9:
				System.out.print("ninth");
				break;
			case 8:
				System.out.print("eigth");
				break;
			case 7:
				System.out.print("seventh");
				break;
			case 6:
				System.out.print("sixth");
				break;
			case 5:
				System.out.print("fifth");
				break;
			case 4:
				System.out.print("fourth");
				break;
			case 3:
				System.out.print("third");
				break;
			case 2:
				System.out.print("second");
				break;
			case 1:
				System.out.print("first");
				break;
			}
			System.out.println(" day of Christmas \n my true love sent to me: ");
			switch (day) 
			{
			case 12:
				System.out.println(DAY12);
			case 11:
				System.out.println(DAY11);
			case 10:
				System.out.println(DAY10);
			case 9:
				System.out.println(DAY9);
			case 8:
				System.out.println(DAY8);
			case 7:
				System.out.println(DAY7);
			case 6:
				System.out.println(DAY6);
			case 5:
				System.out.println(DAY5);
			case 4:
				System.out.println(DAY4);
			case 3:
				System.out.println(DAY3);
			case 2:
				System.out.println(DAY2);
			case 1:
				System.out.println(DAY1);
			}
		}
	}
}
