package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // to print something on the terminal
        int age = 30;
        long viewsCount = 3_123_456_789L; //we added L at the end because if we don't it will consider as integer
        float price = 10.99F; //we added F at the end because if we don't it will consider as double
        char letter = 'A';
        boolean isEligible = false;
        // The above declarations wer e primitive
        //Below declarations are for Reference
        Date now = new Date( );  // "new" is used to allocate memory this needs to be done in reference type & 'now' is variable defined which is an instance of 'Date' class
        System.out.println(now);
         //below is the referencing
       /* Point point1 = new Point(x: 1, y: 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); */
// strings
        String message = "Peaky BLinders";
        System.out.println(message.endsWith("s"));
        System.out.println(message.startsWith("P"));
        System.out.println(message.length());
        System.out.println(message.indexOf("k"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message);

        //arrays
        int[] numbers = {1,9,8,5,5};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
       System.out.println(Arrays.toString(numbers));

       //multidimensional array
        int[][] nums = new int[2][3]; // int[][] nums = {{1,2,3},{4,5,6}};
        nums[0][0] =1;
        System.out.println(Arrays.deepToString(nums));

        //constants
        final float PI = 3.14F;

        // arithmetic expressions
        double result = (double)10/(double)3;
        System.out.println(result);

        //casting and type conversion
        //byte can be converted to short can be to int can be to long
        short x=1;
        int y=x+2;
        System.out.println(y);

        String a = "8";
        int b = Integer.parseInt(a)+2;
        System.out.println(b);

        //math class
       int res = Math.round(1.1F);
        System.out.println(res);

        //formatting numbers
       /* NumberFormat currency = NumberFormat.getCurrencyInstance();
       String out =  currency.format(Number: 1234567.891);
        System.out.println(out);*/

       //Reading Inputs
        Scanner scanner = new Scanner(System.in);
      //  System.out.print("Age : ");
       // byte ag = scanner.nextByte();
       // System.out.println("You are "+ ag);

        System.out.print("Company : ");
        String company = scanner.nextLine();
        System.out.println("Name is " + company);

     ////////////////////////////////////////////////////////////
     // MORTGAGE CALCULATOR

     final byte MONTHS_IN_YEAR =12;
     final byte PERCENT = 100;

     //Scanner scanner = new Scanner(System.in);
     System.out.print("Principal: ");
     int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years*MONTHS_IN_YEAR;
        double mortgage = principal
                *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                /(Math.pow(1 + monthlyInterest, numberOfPayments)));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);


    }

}
