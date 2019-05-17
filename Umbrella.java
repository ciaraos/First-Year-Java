/* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 9
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
   3. Did I indent the code appropriately? 
       Mark out of 10: 8
   4. Did I read the input correctly from the user using appropriate questions? 
       Mark out of 20: 19
   5. Did I use an appropriate (i.e. not more than necessary) series of if statements? 
       Mark out of 30: 29 
   6. Did I output the correct answer for each possibility in an easy to read format? 
       Mark out of 15: 14
   7. How well did I complete this self-assessment? 
       Mark out of 5: 4
   Total Mark out of 100 (Add all the previous marks): 93
*/
import javax.swing.JOptionPane;

public class Umbrella {

	public static void main(String[] args) {
		int answer = JOptionPane.showConfirmDialog(null, "Is it raining?");
		boolean raining = (answer == JOptionPane.YES_OPTION);
		if (raining) {
			JOptionPane.showMessageDialog(null, "Bring an umbrella and open it");
		} else {
			answer = JOptionPane.showConfirmDialog(null, "Might it rain?");
			boolean mightRain = (answer == JOptionPane.YES_OPTION);
			if (mightRain)
				JOptionPane.showMessageDialog(null, "Bring an umbrella but don't open it");
			else
				JOptionPane.showMessageDialog(null, "Don't bring an umbrella");
		}
	}

}
