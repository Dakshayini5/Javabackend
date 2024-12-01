package com.assignment1;
public class primeNumber {


    public static boolean isPrime(int number) {
         for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 50 are:");


        for (int num = 2; num <= 50; num++) {
            if (isPrime(num)) {
                System.out.print(num + " "); 
            }
        }
    }
}
