package com.assignment1;
import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
    }
}
