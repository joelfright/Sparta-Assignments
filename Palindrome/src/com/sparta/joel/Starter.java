package com.sparta.joel;

public class Starter {

    public static void start(){
        String palindrome = "racecar";
        Printer.printString("Checking palindrome of: " + palindrome);
        if (Palindrome.checkPalindrome(palindrome)) {
            Printer.printString(palindrome + " is palindrome");
        } else {
            Printer.printString(palindrome + " is not palindrome");
        }
        Printer.printString(" ");

        String longestPalindrome = "the level racecar radar rotator, used as a redivider.";
        Printer.printString("Checking for longest palindrome in: '" + longestPalindrome +"'");
        if(longestPalindrome == ""){
            Printer.printString("No palindrome");
        }else{
            Printer.printString("The longest palindrome is " + Palindrome.getLongestPalindrome(longestPalindrome));
        }
    }

}
