/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10:   9
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:  4
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:  5
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:  9
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:  9
   6. Did I indent the code appropriately?
       Mark out of 10:  8
   7. Did I read the input correctly from the user using (an) appropriate question(s)?
       Mark out of 10:  9
   8. Did I compute the answer correctly for all cases?
       Mark out of 20:  20
   9. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:  9
   10. How well did I complete this self-assessment?
       Mark out of 10:  8
   Total Mark out of 100 (Add all the previous marks):  90
*/



import java.util.Scanner;
import javax.swing.JOptionPane;
public class Assignment1 {

    public static final int NEW_PENNIES_PER_OLD_PENNY = 67;
    public static final int OLD_PENNIES_PER_OLD_SHILLING = 12;
	public static final int OLD_SHILLINGS_PER_OLD_POUND = 20;
	public static final int NEW_PENNIES_PER_NEW_POUND = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("enter old pounds");
Scanner input = new Scanner( System.in ); 
int pounds = input.nextInt();
System.out.print("enter old shillings");
input = new Scanner ( System.in );
int shillings = input.nextInt();
System.out.print("enter old pennies");
input = new Scanner( System.in );
int pennies = input.nextInt();
double oldPoundsToShillings = pounds*OLD_SHILLINGS_PER_OLD_POUND;
double oldTotalShillings = oldPoundsToShillings+shillings;
double oldShillingsToOldPennies = oldTotalShillings*OLD_PENNIES_PER_OLD_SHILLING;
double oldTotalPennies = oldShillingsToOldPennies+pennies;
double totalNewPennies = oldTotalPennies*NEW_PENNIES_PER_OLD_PENNY;
double totalNewPounds = totalNewPennies/NEW_PENNIES_PER_NEW_POUND;
System.out.print("your total is £" + totalNewPounds);

	}

}
