package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);

	int userYear1;
	int userMonth;
	int userDay2;
	int userDay1;
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


        System.out.println("What day in "+printMonth(userMonth)+" were you born");
        userDay1 = keyboard.nextInt();
        System.out.println("What year were you born");
        userYear1 = keyboard.nextInt();



        }
    public static int userMonth2(int userMonth) {

        switch (userMonth) {
            case 1:
                return 13;
            break;
            case 2:
                return 14;
            break;
            case 3:
                return 3;
            break;
            case 4:
                return 4;
            break;
            case 5:
                return 5;
            break;
            case 6:
                return 6;
            break;
            case 7:
                return 7;
            break;
            case 8:
                return 8;
            break;
            case 9:
                return 9;
            break;
            case 10:
                return 10;
            break;
            case 11:
                return 11;
            break;
            case 12:
                return 12;
            break;
        }


    public static int weekDay(int userDay ,int userMonth2,int userYear1){

            weekDay = userDay + 13 [userMonth2 + 1]





    }

    }

        

















        //method that will take the number for the month
        //return the written month

    public static String printMonth(int userMonth) {



        switch (userMonth) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Octeber";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";

        }
    }
}



















