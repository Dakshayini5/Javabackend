package com.assignment1;
import java.util.Scanner;
public class abundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        System.out.println(sum > num ? "Abundant Number" : "Not Abundant Number");
    }
}