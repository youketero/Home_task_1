package com.epam.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("enter number of ft ");
        Scanner scanner = new Scanner(System.in);
        int ft = scanner.nextInt();
        double kg = ft*0.4536;
        double g = (kg%(int)kg);
        g = g*1000;
        System.out.println("killogram -> "+ (int)(kg) +" gramm ->"+(int)(g));
    }
}
