/** Program: Palindromic Primes Program
 * File: PalindromicPrimes.java
 * Summary: This file creates a program that iterates over the first 100,000 positive integers and finds and lists
 * all of the palindromic primes numbers.
 *
 * Author: Keith Harrison
 * Date: 3/20/2018
 * 
 */

public class PalindromicPrimes {

	public static boolean isPrime(int n) {
		int[] divisors = { 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean prime = false;

		if (n == 1 || n == 0) {
			prime = false;
		} else {
			for (int i = 0; i < divisors.length; i++) {
				if (n % divisors[i] == 0 && n != divisors[i]) {
					prime = false;
					break;
				} else {
					prime = true;
				}
			}
		}

		return prime;
	}

	public static boolean isPalindrome(int n) {
		char[] digits = Integer.toString(n).toCharArray();
		boolean palindrome = false;
		int count = 0;

		if (digits.length == 1) {
			palindrome = true;
		} else if (digits.length % 2 == 0) {
			for (int i = digits.length - 1; i >= digits.length / 2; i--) {
				if (digits[count] == digits[i]) {
					palindrome = true;
					count++;
				} else {
					palindrome = false;
					break;
				}
			}
		} else {
			for (int j = digits.length - 1; j >= (digits.length - 1) / 2; j--) {
				if (digits[count] == digits[j]) {
					palindrome = true;
					count++;
				} else {
					palindrome = false;
					break;
				}
			}
		}

		return palindrome;
	}

	public static void main(String[] args) {
            
            int ticker = 0;
            
		System.out.println("Palindromic Primes:");
		for (int i = 1; i <= 100000; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.print(i + "\t");
                                ticker++;
                                    if(ticker == 4) {
                                        System.out.println();
                                        ticker = 0;
                                }

			}
		}

	}

}
