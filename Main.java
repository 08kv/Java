package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         // comparision operator
        int x = 1;
        int y = 1;
        System.out.println(x == y);
        // Logical Operators
        int temperature = 92;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
        //another example
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;
        System.out.println(isEligible);
        // IF Statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It is a hot day");
            System.out.println("Drink water");
        }
        else if (temp == 20 )
            System.out.println("Beautiful dau");

        else
            System.out.println("Cold day");
        //Simple IF Statement
        int income = 120_000;
        boolean moreincome = (income > 100_000);
        System.out.println(moreincome);
        //Ternary Operator
        int kamai = 20_000;
        String className = kamai > 100_000 ? "First" : "Economy";
        System.out.println(className);

         //Switch statements
         String role = "admin";
        switch(role){
            case "admin":
                System.out.println("You are admin");
                break;
            case "Moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("You are a gust");
        }

        //FIZZ BIZZ Exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("IO: ");
        int no = scanner.nextInt();
        if(no%5==0)
            System.out.println("Fizz");
        else if(no%3==0)
            System.out.println("Buzz");
        else if(no%5==0 && no%3==0)
            System.out.println("FizzBUZZ");
        else
            System.out.println("No fizz neither buzz nor fizzbuzz");





    }
}