package com.company;

import java.util.Scanner;
import java.util.Date;

public class Main {

public static final int MINAGE = 18;

    public static void main(String[] args) {
        System.out.println("Welcome to the UMBC Ticket System!, We are currently showing the following movies: ");
        System.out.println("");

        String[][] multipleList = {{"Movie Title |", "(Movie Rating) |", " Movie Time1 |", "Movie Time2 "},
                {"IT", "(Rated R) |", "5:00pm |", "8:30pm "},
                {"Get Out", "(Rated R)|", "7:45pm |", "9:00pm "},
                {"Lion King", "(Rated G)|", "12:30pm | ", "6:15pm "},
                {" Wonder Women", "(Rated PG13)|", "3:45pm | ", "8:00pm"}};

        // for loop in order to print out the movie list
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multipleList[i][j] + "");
            }
            System.out.println(" ");
            System.out.println("------------------------------------------------");
        }

        // Movie Selection and enter age in order to verify if they can see It and GetOut
        Scanner input = new Scanner(System.in);
        System.out.println("Please select a movie(1-4): ");
        int selectMovie = input.nextInt();
        System.out.println("Please enter your age: ");
        int personAge = input.nextInt();
        if ((selectMovie == 1 || selectMovie == 2) && personAge < MINAGE) {
            System.out.println("Sorry you are not old enough to see this movie! Try Again");
        }

        else {
            System.out.println("You selected " + multipleList[selectMovie][0] + "!");
            // Get the cost of the ticket price based on the person's age
            Cost ticketPrice = new Cost(selectMovie, personAge);

            // Customer receives confirmation for the ticket, the date and time is printed
            CustomerInfo customer1 = new CustomerInfo();
            Date date = new Date();
            System.out.println("Current Date & Time: " + date.toString());

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name;
            name = userInput.next();
            customer1.setCustomerName( name);
            System.out.println("Movie: " + multipleList[selectMovie][0]);
            customer1.makeConfirmation(name);

        }
    }

}
