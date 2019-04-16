package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);

	int userYear1;
	int userMonth;
	int userDay;
	int userYear2;

        System.out.println("Monday's child is fare of face,");
        System.out.println("Tusday's child is full of grace,");
        System.out.println("Wednesay's child is full of woe,");
        System.out.println("Thursday's child has far to go,");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
        System.out.println("");
        System.out.println("Lets see what day you where born on");
        System.out.println("What month were you born (As a number)");
        userMonth = keyboard.nextInt();


        System.out.println("What day in that month were you born");
        userDay = keyboard.nextInt();
        System.out.println("What year were you born");
        userYear1 = keyboard.nextInt();



        }
        //method that will take the number for the month
        //return the written month

    public static String printMonth(int userMonth) {


        switch (userMonth) {
            case '1':
                System.out.println("");
                break;
            case '2':
                System.out.println("");
                break;
            case '3':
                System.out.println("");
                break;
            case '4':
                System.out.println("");
                break;
            case '5':
                System.out.println("");
                break;
            case '6':
                System.out.println("");
                break;
            case '7':
                System.out.println("");
                break;
            case '8' :
                System.out.println("");
                break;
            case '9' :
                System.out.println("");
                break;
            case '10' :
                System.out.println("");
                break;
            case '11' :
                System.out.println("");
                break;
            case '12' :
                System.out.println("");
                break;
           
        }


    }
}















