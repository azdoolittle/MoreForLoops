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


 */
import java.util.Scanner;

public class MoreForLoops {
    public static void main(String[] args) {
        isEven();
        isOdd();
        reverseString("Reversed example.");

    }public static void checkEvenOrOdd(String evenOrOdd) {
        if (evenOrOdd.equals("even")) {
            for (int i = 1; i <= 20; i ++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
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
        System.out.println(reversed);
    }
}
