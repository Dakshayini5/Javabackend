package com.assignment1;
import java.util.Scanner;
public class greatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a = sc.nextInt(); 
        System.out.println("Enter a second number:");
        int b = sc.nextInt(); 
        System.out.println("Enter a third number:");
        int c = sc.nextInt();
        System.out.println("The greatest Number is:" +Math.max(a, Math.max(b, c)));
    }
}
