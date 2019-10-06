/*
 * Name: Kent Larson
 * ID: 1213010550
 * Class ID: 70641
 * Assignment #: 1
 * Description: This JUnit test will test the program "Palindrome.java". It
 * 				will test if the constructor is "not null" and whether the
 * 				method "isPalindrome()" returns true or not.
 */

package assign1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	/**
	 * Constructs a new Palindrome object and tests to see if it is not null.
	 */
	@Test
	public void testPalindrome()
	{
		Palindrome term =
				new Palindrome("10. Rats live on no evil star? 0/1.");
		assertNotNull(term);
	}
	
	/**
	 * Constructs a new Palindrome object then tests to see whether the phrase
	 * is a palindrome.
	 */
	@Test
	public void testIsPalindrome()
	{
		Palindrome term =
				new Palindrome("10. Rats live on no evil star? 0/1.");
		assertTrue(term.isPalindrome());
	}
}
