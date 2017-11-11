/** Program: Finds Prime Numbers
 * File: PrimeNumberMethod.java
 * Summary: Finds Prime numbers
 * Author: Tim James
 * Date: November 7, 2017
 */

public class PalindromicPrimes {
    
    public static void main(String[] args) {
        
        int n = 100000; // number to test to palindromic primes
        int startingPoint = 1;
        int startingPrime = 2;
        int lineCount = 0;
        
        System.out.println("The palindromic prime numbers between 0 and 100,000 are: ");
        
        System.out.println(); // blank line       
        
        // Checks if number is both palindrome & prime and prints to console
        while (startingPoint <= n) {
            if (IsPrime(startingPrime) && IsPalindrome(startingPrime)) { // tests if number is both prime and palindrome
                System.out.print(startingPrime + " ");
                lineCount++; // keeps track of how many items are in the line
                if (lineCount == 10) { // prints 10 integers per line
                    System.out.println();
                    lineCount = 0; // when 10 items per line are reached lineCount is reset to 0 to continue the loop
                }
            }
            startingPoint++; 
            startingPrime++; 
        }
        
        
    }
    // Method for checking if the number is prime
    public static boolean IsPrime(int isPrime) {
        if (isPrime % 2 == 0 && isPrime != 2) {
            return false;
        }
        
        int sqrtPrime = (int)Math.sqrt(isPrime);
        for (int i = 3; i <= sqrtPrime; i += 2) {
            if (isPrime % i == 0) {
            return false;
            }
        }
        
        return true;
    }
    // Method for checking if the number is palindrome
    public static boolean IsPalindrome(int isPrime) {
        int isPrimeBackup = isPrime;
        int reverse = 0;
        
        while (isPrime > 0) {
            reverse = reverse * 10 + isPrime % 10;
            isPrime = isPrime / 10;
        }
        
        return (isPrimeBackup == reverse);
    }
}
    
