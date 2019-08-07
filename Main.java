package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// FOR LOOPS
    for (int i=0;i<5;i++)
        System.out.println("Peaky Blinders");

    //WHILE LOOPS
    int j=5;
    while(j>0){
        System.out.println("using while");
        j--;
    }

    //another WHILE
        String input= "";
    Scanner scanner = new Scanner(System.in);
    while(!input.equals("quit")) {
        System.out.println("Input:");
        input = scanner.next().toLowerCase();
        System.out.println();
    }
     //Do while loops

     do{
         System.out.println("Input : ");
         input = scanner.next().toLowerCase();
         System.out.println(input);

    }while(!input.equals("quit"));

     //For-Each Loop
        String[] fruits = {"Grace","Tommy","Arthur"};

        for(int i=0;i<fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }

        for(String fruit:fruits)
            System.out.println(fruit);


    }
}
