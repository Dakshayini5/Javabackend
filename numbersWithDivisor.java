package com.assignment1;
import java.util.Scanner;

public class numbersWithDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == x) System.out.println(i);
        }
        sc.close();
    }
}