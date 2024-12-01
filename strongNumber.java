package com.assignment1;
import java.util.Scanner;
public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10, fact = 1;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        System.out.println(num == sum ? "Strong Number" : "Not Strong Number");
    }
}
