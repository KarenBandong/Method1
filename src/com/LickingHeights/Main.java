package com.LickingHeights;

import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        String Username;

        printGreetings("World");
        System.out.println("Hi! What is your name?");
        Username= keyboard.nextLine();
        printHello(Username);

    }
            public static void printGreetings(String noun){
        System.out.println("Hello "+ noun);
        }


        public static void printHello(String Username){
        System.out.println("Hello "+ Username);
        }


    }
