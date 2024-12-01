package com.assignment1;
import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) days = 30;
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) days = 29;
            else days = 28;
        }
        System.out.println(days);
        sc.close();
    }
}