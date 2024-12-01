package com.assignment1;
import java.util.Scanner;
public class palindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt(); 
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if(num == reverse) {
        	 System.out.println("The entered number is palindrome");
        }
        else {
        	System.out.println("The entered number is not a palindrome");
        }
    }
}