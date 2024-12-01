package com.assignment1;

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year");
        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        System.out.println("The entered year is Leap year");
    }
        else {
            System.out.println("The entered year is Not a Leap year");

        }
}
}