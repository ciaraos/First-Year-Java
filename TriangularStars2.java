/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
        Mark out of 5:5         Comment: they are formatted correctly in lower camel case and I believe they are easy to follow
 2. Did I indent the code appropriately?
        Mark out of 5:5         Comment: I indented where necessary
 3. Did I write the determineStarNumber or determineTriangleNumber function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 20:20         Comment: I used parameters and return types and i think i invoked it correctly
 4. Did I write the isStarNumber function correctly (parameters, return type and function body) and invoke it correctly?
       Mark out of 20:20          Comment: used parameters and return types and I think I invoked it correctly
 5. Did I calculate and/or check triangle numbers correctly?
       Mark out of 15:15         Comment: I tested various triangle numbers 
 6. Did I loop through all possibilities in the program using system defined constants to determine when to stop?
       Mark out of 10:8         Comment: I tried to do this using Integer.MAX_VALUE
 7. Does my program compute and print all the correct triangular star numbers?
       Mark out of 20:20      Comment: I think these are all the correct numbers outputted
 8. How well did I complete this self-assessment?
        Mark out of 5:5        Comment: I put thought and effort into my comments and marks
 Total Mark out of 100 (Add all the previous marks):98
*/
public class TriangularStars2 {
	public static final int MAX_VALUE = Integer.MAX_VALUE;

	public static int determineStarNumber(int index) 
	{
		// s = 6n(n-1) + 1
		int starNumber = (((6 * index) * (index - 1)) + 1);
		return starNumber;
	}

	public static boolean isStarNumber(int triangleNumber) 
	{
		int index = 0;
		int triangularStar = 0;
		boolean isStar = false;
		do 
		{
			triangularStar = determineStarNumber(index);
			index++;
			if (triangularStar >= triangleNumber) 
			{
				isStar = true;
			}
		} 
		while (!isStar);
		if (triangularStar == triangleNumber) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void output() 
	{
		System.out.println("The numbers that are simultaniously star numbers and triangle numbers are: ");
		int triangleNumber = 0;
		for (int index = 0; determineStarNumber(index) < MAX_VALUE && triangleNumber >= 0; index++) 
		{
			triangleNumber = triangleNumber + index; // t = 1 + 2 + … + (n-1) + n.
			if (isStarNumber(triangleNumber)) 
			{
				System.out.println(triangleNumber);
			}
		}
	}

	public static void main(String[] args) {
		output();
	}

}
