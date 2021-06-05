package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("What is the password? ");
        String password = in.nextLine();

        if(password.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }
}
