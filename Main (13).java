/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is the order amount? ");
    double orderAmount = input.nextDouble();

    System.out.print("What is the state? ");
    String state = input.next();

    double tax = 0;

   if(state.equalsIgnoreCase("WI")) {
      System.out.printf("The subtotal is $%.2f\n", orderAmount);
      
      tax = 5.5/10;
      
      System.out.printf("The tax is $%.2f\n", tax);
    } 

    double total = orderAmount + tax;

    System.out.printf("The total is $%.2f\n", total);

    input.close();
  }
}