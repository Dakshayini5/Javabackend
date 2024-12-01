package com.assignment1;
import java.util.Scanner;

public class handshakes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        System.out.println((people * (people - 1)) / 2);
        sc.close();
    }
}