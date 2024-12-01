package com.assignment1;
import java.util.Scanner;

public class replaceZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0, place = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) digit = 1;
            result += digit * place;
            place *= 10;
            num /= 10;
        }
        System.out.println(result);
        sc.close();
    }
}