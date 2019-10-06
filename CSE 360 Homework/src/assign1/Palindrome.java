/*
 * Name: Kent Larson
 * ID: 1213010550
 * Class ID: 70641
 * Assignment #: 1
 * Description: This program will test a string and determine whether it is a
 * 				palindrome or not. The string is only checked for alphanumeric
 * 				characters. Symbols, whitespace, and case are not checked.
 */

package assign1;

/**
 * Palindrome is the base class that checks whether a string is a palindrome or
 * not.
 */
public class Palindrome
{
	private String testString;
	
	/**
	 * The constructor for the Palindrome class that will initialize testString
	 * to the upper case version of the given phrase.
	 * 
	 * @param phrase	a string that will be tested as to whether or not it is
	 * 					a palindrome
	 */
	public Palindrome(String phrase)
	{
		testString = phrase.toUpperCase();
	}
	
	/**
	 * Performs a test on the test string to determine whether or not the
	 * string is a palindrome. It uses a while loop to continually compare a
	 * character in the first section of the string with a character in the
	 * second section of the string.
	 * <p>
	 * Using if statements, it will check whether each character is outside the
	 * bounds of the ASCII value for numbers 0 to 9 and letters A to Z. A
	 * character outside those bound will cause the current index to be either
	 * added onto or subtracted from by 1 depending on whether the character
	 * was in the first or section section of the string. This will essentially
	 * "skip" any non-alphanumeric characters and only test for equal
	 * characters if both are alphanumeric.
	 * <p>
	 * If the characters are equal to each other, the first index will be added
	 * to by 1 and the second will be subtracted to by 1 and the loop will
	 * continue. It will continue until the indices reach each other. If the
	 * characters are not equal to each other, the boolean variable "check0"
	 * will be set to "false" and the loop will end.
	 * 
	 * @return	the boolean variable "check0" according to whether a string is
	 * 			a palindrome or not
	 */
	public boolean isPalindrome()
	{
		int firstHalf = 0;
		int secondHalf = testString.length() - 1;
		boolean check0 = true;
		
		while(firstHalf < secondHalf && check0)
		{
			int letter1 = (int) testString.charAt(firstHalf);
			int letter2 = (int) testString.charAt(secondHalf);
			boolean check1 = true;
			boolean check2 = true;
			
			if((letter1 < 48 || letter1 > 57) &&
					(letter1 < 65 || letter1 > 90))
			{
				firstHalf++;
				check1 = false;				
			}
			
			if((letter2 < 48 || letter2 > 57) &&
					(letter2 < 65 || letter2 > 90))
			{
				secondHalf--;
				check2 = false;
			}
			
			if(check1 && check2)
			{
				if(letter1 == letter2)
				{
					firstHalf++;
					secondHalf--;
				}
				else
				{
					check0 = false;
				}
			}
		}
		
		return check0;
	}
}
