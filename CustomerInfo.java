package com.company;

import java.util.Random;
import java.util.Scanner;

public class CustomerInfo

    {
        private String customerName;
        private int customerAge;

        public CustomerInfo()
        {
            
        }

        public CustomerInfo(String name, int age)
        {
            customerName = name;
            customerAge = age;
        }

        public String getCustomerName(){return customerName;}

        public void setCustomerName(String customerName){this.customerName = customerName;}

        public int getCustomerAge() {return customerAge;}

        public void setCustomerAge (int customerAge) {this.customerAge = customerAge;}

        public static String makeConfirmation (String customerName)
        {
            //Uses a random number from 1000-5000
            //Takes the last character of the user's name string as part of the confirmation code
            Scanner input = new Scanner(System.in);

            char ch1 = customerName.charAt(0);
            System.out.println (" Please enter your last name. ");
            String Lastname = input.next();
            char ch2 = Lastname.charAt(0);
            char ch3 = Lastname.charAt(1);

            System.out.println (" Please enter a number. ");
            int num1 = input.nextInt();
            System.out.println (" Please enter another number. ");
            int num2 = input.nextInt();
            int RCnum = Math.max (num1,num2);

        //Random number generator and the first char from the user's first name
            Random number = new Random();
            int randNum = (int) (Math.random() * 5001) + 1000;
            String firstChar = customerName.substring(customerName.length() - 1);

        // Confirmation code with the user's first intial + characters from the last name + Random number generator
            String confirmationCode = firstChar.toUpperCase() + randNum;
            System.out.println("Confirmation Number is " + confirmationCode + ch1 + ch2 + ch3 + RCnum + ". Please show your Confirmation Number to the Ticket Counter Attendent in order to pay for your ticket. Enjoy your movie!");
            return confirmationCode;






