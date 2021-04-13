package com.savneet;

import java.util.Scanner;

public class comission {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Sales: ");
        double sales = keyboard.nextDouble();
        double rate=0.0;
        System.out.print("Enter advance pay: ");
        double advance=keyboard.nextDouble();

        if(sales <10000)
        {
            rate =5;
        }
        else if( sales>=10000 && sales <15000)
        {
            rate =10;
        }
        else if( sales>=15000 && sales <18000)
        {
            rate =12;
        }
        else if( sales>=18000 && sales <22000)
        {
            rate =15;
        }
        else if( sales>=22000)
        {
            rate =16;
        }

        double commission= sales*rate/100;
        double pay=commission-advance;
        if (pay <0)
        {
            System.out.println("Amount to be reimbursed $"+Math.abs(pay));
        }
        else {
            System.out.println("Pay for this month is $"+pay);
        }


    }
}
