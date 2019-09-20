package com.epam;

import java.util.Scanner;

public class Application {
       public static void main(String[] args) {
Task5();
       }
    public static void Task5(){

        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter number x");
        int x = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter number y");
        int y = inp2.nextInt();
        for(int k = 0; k < y; k++){
            for(int i = 0; i < x; i++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
            //System.out.println("darova daun");
           // System.out.println("давай вводь число, а я його суммую з усіма числами до нього:");
           // Scanner input = new Scanner(System.in);
          //  int value= input.nextInt();
           // int sum = 0;
           // for (int i=1;i<=value;i++){
             //   sum = sum + i;}
           // System.out.println("Мій магічний шар показує: " + sum);
        //}
        //System.out.println("enter a number");
        //for (int i = 3; i <= 10; i++) {

       // Scanner input = new Scanner(System.in);
       // int value = input.nextInt();
       // System.out.println(value); };
}



