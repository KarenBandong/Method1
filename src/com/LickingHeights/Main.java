package com.LickingHeights;

import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String Username;


        Greetings();
        System.out.println("Hi! What is your name?");
        Username = keyboard.nextLine();
        printHello(Username);
        int x = 20;
        int y = 10;
        double pValue = 100;
        double zValue = 60;
        double K= 3.14;
        double L= 5.16;

        System.out.println(printHello (Username));
        System.out.println(multiplying(x, y));
        System.out.println(division(pValue, zValue));




    }

    public static void Greetings(){
        System.out.println("Hello World");
    }


    public static String printHello(String Username) {

        return "Hello "+ Username +"!";
    }

    public static int multiplying(int x, int y) {

        return x * y;
    }

    public static double division(double pValue, double zValue) {
        return pValue/zValue;
    }





    }
