package com.epam.task1;

public class Task1 {

    public static void main(String[] args) {
	    int number = 567;
	    int number2 = (567%10)*100;
	    int number3 = ((number/10)%10)*10;
	    int number4 = (number/100)%10;
        System.out.println("number-(reverse)number -> "+ (number-(number3+number4+number2)));
    }
}
