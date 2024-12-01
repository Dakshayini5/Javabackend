package com.assignment1;
import java.util.Scanner;

public class numbersToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        while (num > 0) {
            int digit = num % 10;
            result = words[digit] + " " + result;
            num /= 10;
        }
        System.out.println(result.trim());
        sc.close();
    }
}