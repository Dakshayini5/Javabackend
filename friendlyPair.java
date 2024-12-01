package com.assignment1;
import java.util.Scanner;
public class friendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sumA = 0, sumB = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) sumA += i;
        }
        for (int i = 1; i <= b / 2; i++) {
            if (b % i == 0) sumB += i;
        }
        System.out.println(sumA / (double) a == sumB / (double) b ? "Friendly Pair" : "Not Friendly Pair");
    }
}
