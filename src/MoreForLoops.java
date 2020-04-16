/*
Pseudocode:
import scanner

odd / even nums:
declare helper method
method accepts string representing even or odd
write loop from 1-20
define conditions for odd
    print the odds
define conditions for even
    print the evens

declare odd method
declare even method

reverse a string:
declare method
method accepts string argument
declare reversed string var
write for loop
print characters based on reverse position

factors of a number:
declare method
argument is an int
write for loop
define condition for factor
    number divided num2 without a remainder
if condition is true, print it

factorials of a number:
declare method
argument is an int
declare int var
write for loop
for each iteration:
    integer equals itself multiplied by the lower number until 1
 */
import java.util.Scanner;

public class MoreForLoops {
    public static void main(String[] args) {
        isEven();
        isOdd();
        reverseString("This is an example.");
        findFactors(10);
        computeFactorial(1000);

    }

    public static void checkEvenOrOdd(String evenOrOdd) {
        if (evenOrOdd.equals("even")) {
            System.out.println("Even numbers are: ");
            for (int i = 1; i <= 20; i ++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Odd numbers are: ");
            for (int k = 1; k <= 20; k ++) {
                if (k % 2 == 1) {
                    System.out.println(k);
                }
            }
        }
    }

    public static void isEven() {
        checkEvenOrOdd("even");
    }

    public static void isOdd() {
        checkEvenOrOdd("odd");
    }

    public static void reverseString(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i --) {
            reversed = reversed.concat(String.valueOf(input.charAt(i)));
        }
        System.out.println(input + "\n\t reversed is \n" + reversed);
    }

    public static void findFactors(int num) {
        for (int i = 1; i < num; i ++) {
            if (num % i == 0) {
                System.out.printf("Factors of %d: %d\n", num, i);
            }
        }
    }

    public static void computeFactorial(int num) {
        long factorial = num;
        for (int i = num; i > 0; i --) {
            factorial *= (num - 1);
        }
        System.out.println("Factorial of num: " + factorial);
    }
}
