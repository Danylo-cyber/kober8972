package com.epam;

import java.util.Scanner;

public class Application {
        public static void main(String[] args) {
            System.out.println("darova daun");
            System.out.println("давай вводь число, а я його суммую з усіма числами до нього:");
            Scanner input = new Scanner(System.in);
            int value= input.nextInt();
            int sum = 0;
            for (int i=1;i<=value;i++){
                sum = sum + i;}
            System.out.println("Мій магічний шар показує: " + sum);
        }
        //System.out.println("enter a number");
        //for (int i = 3; i <= 10; i++) {

       // Scanner input = new Scanner(System.in);
       // int value = input.nextInt();
       // System.out.println(value); };
}


