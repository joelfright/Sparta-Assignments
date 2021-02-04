package com.sparta.joel;


public class Palindrome {

    public static boolean checkPalindrome(String text){
        text.toLowerCase();
        char[] characters  = text.toCharArray();
        for(int index = 0; index < characters.length / 2; index++){
            if(characters[index] != characters[characters.length - 1 - index]){
                return false;
            }
        }
        return true;
    }

    public static String getLongestPalindrome(String text){
        String[] words = text.replace(".","").split(" ");
        String max = "";

        for(String word : words){
            if(checkPalindrome(word) && (word.length() > max.length())){
                max = word;
            }
        }
        return max;
    }

}
