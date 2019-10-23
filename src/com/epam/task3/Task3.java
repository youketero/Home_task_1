package com.epam.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("enter deposit -> ");
        Scanner dep = new Scanner(System.in);
        int deposit = dep.nextInt();
        System.out.print("enter month -> ");
        Scanner mon = new Scanner(System.in);
        int month = mon.nextInt();
        double percent = 0.12;
        System.out.println((int)(deposit*((percent*month)/12)));
    }
}
