package com.company;

public class Salestax {

    /*Write a program that calculates the total cost of
an item’s price plus sales tax and executes code
based on that price

• If the total cost is less than $50, print “Go for it!”

• If the total cost is greater than $50 but less than
$100, print “Are you sure about this?”

• If the total cost is greater than $100, print “I’m hiding your credit card!"*/
    public static void main(String[] args) {
        double itemPrice = 50;
        double salesTax = 0.06;
        double totalCost = itemPrice * (1 + salesTax);
        System.out.println("Total cost is " + totalCost);

        if (totalCost > 100){
            System.out.println("I'm hiding your credit card.");
        }else if (totalCost > 50){
            System.out.println("Are you sure about this?");
        }else{
            System.out.println("Go for it!");

        }
    }
}
