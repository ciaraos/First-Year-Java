
/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
        Mark out of 5: 5, I believe the variable names are easy to follow and formatted correctly
 2. Did I indent the code appropriately?
        Mark out of 5: 5, the code is indented where necessary
 3. Did I write the createCipher function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 20: 15, the function works but doesn't take into account spaces
 4. Did I write the encrypt function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 20: 20, the function prints out the encryption
 5. Did I write the decrypt function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 20: 20, the function works and prints out the decryption
 6. Did I write the main function body correctly (repeatedly obtaining a string and encrypting it and then decrypting the encrypted version)?
       Mark out of 25: the main repeatedly takes in user input and outputs both the encrypted and decrypted versions  
 7. How well did I complete this self-assessment?
        Mark out of 5: 5
 Total Mark out of 100 (Add all the previous marks): 95
*/
import java.util.Scanner;
import java.util.Random;

public class Cipher {
	public static final int NUMBER_OF_ELEMENTS = 27;
	public static final char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
											'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void userInput() 
	{
		boolean finished = false;
		while (!finished) 
		{
			System.out.print("Enter plain text that you would like to convert to a cipher (or type 'quit') ");
			Scanner inputScanner = new Scanner(System.in);
			if (inputScanner.hasNext("quit")) 
			{
				finished = true;
				System.out.print("Goodbye");
				inputScanner.close();
			} 
			else if (inputScanner.hasNextLine()) 
			{
				String textEntered = inputScanner.nextLine();
				String lowercaseString = textEntered.toLowerCase();
				char[] characterArray = lowercaseString.toCharArray();
				char[] newAlph = randomiseAlphabet(alphabet);
				encrypt(characterArray, alphabet, newAlph);
				System.out.print("Decryption: \t");
				decrypt(characterArray, alphabet, newAlph);
			} 
			else 
			{
				System.out.print("Please enter a word e.g. 'hello' ");
			}
		}
	}

	public static char[] randomiseAlphabet(char[] alphabet) 
	{
		if (alphabet != null) 
		{
			Random generator = new Random();
			for (int index = 0; index < alphabet.length; index++) 
			{
				int alphIndex = generator.nextInt(alphabet.length);
				char temp2 = alphabet[index];
				alphabet[index] = alphabet[alphIndex];
				alphabet[alphIndex] = (char) temp2;
			}
		}
		// String anotherAlph = new String(alphabet);
		return alphabet;
	}

	public static void createCipher(char characterArray[], char alphabet[], char[] newAlph) 
	{
		int alphIndex = 0;
		int inputIndex = 0;
		if (characterArray != null) 
		{
			while (alphIndex < alphabet.length && inputIndex < characterArray.length) 
			{
				if (characterArray[inputIndex] == alphabet[alphIndex]) 
				{
					System.out.print(newAlph[inputIndex]);
					inputIndex++;
					alphIndex = 0;
				} 
				else 
				{
					alphIndex++;
				}
			}
		}
	}

	public static void encrypt(char characterArray[], char alphabet[], char newAlph[]) 
	{
		System.out.print("Encryption: \t");
		createCipher(characterArray, alphabet, newAlph);
		System.out.print("\n");
	}

	public static void decrypt(char characterArray[], char[] alphabet, char[] newAlph) 
	{
		int alphIndex2 = 0;
		int inputIndex2 = 0;
		if (characterArray != null) 
		{
			while (alphIndex2 < newAlph.length && inputIndex2 < characterArray.length) 
			{
				if (characterArray[inputIndex2] == newAlph[alphIndex2]) 
				{
					System.out.print(characterArray[inputIndex2]);
					inputIndex2++;
					alphIndex2 = 0;
				} 
				else 
				{
					alphIndex2++;
				}
			}
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		userInput();
	}

}
