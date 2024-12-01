package com.assignment1;
import java.util.Scanner;

public class sumOfTwoPrimes {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}