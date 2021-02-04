package com.sparta.joel;

public class RecursiveFibonacci {

    public static int recursiveFibonacci(int current){
        if(current <= 1) {
            return current;
        }else{
            return recursiveFibonacci(current - 1) + recursiveFibonacci(current - 2);
        }
    }

    public static void printFibonacci(int length){
        for(int i = 0; i < length; i++){
            Printer.printString(recursiveFibonacci(i) + " ");
        }
    }

}
