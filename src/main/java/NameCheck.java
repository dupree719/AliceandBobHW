import java.util.Scanner;

public class NameCheck {
    public static void main(String[] args) {
        //Create scanner object
        Scanner x = new Scanner(System.in);

        //Prompt that asks for name of user
        System.out.println("What is your name, user?");
        //wait for user to enter line
        String name = x.nextLine();

        //Create if statement that says if the names Alice or Bob are entered, greeting message displays
        if(name.equals("Alice") || name.equals("Bob")) {
            System.out.print("Greetings" + " " +  name);
        }

            else{
                System.out.println("You are not qualified for a greeting.");
            };

        //wait for user to enter line

        //print what is entered
      //  System.out.println("What is your name, user?");
        //create scanner object

        }
    }







//Alice and Bob Greeting
//Objectives
//To demonstrate your understanding of objects
//To demonstrate your understanding of operators
//To demonstrate your understanding of user input
//To demonstrate your understanding of strings
//Overview
//Write a program that asks the user for his/her name and only the users Alice and Bob are greeted with their names.
//
//
//Instructions
//Understand how to get input from user
//Create conditional to check against Alice and Bob
//Print greeting to screen if Alice or Bob are true