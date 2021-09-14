/*
 *  UCF COP3330 Fall 2021 Exercise 23 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class CarIssues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter y for yes, n for no (lowercase)\nIs the car silent when you turn the key? ");
        String input = scan.nextLine();
        if (input.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            input = scan.nextLine();
            if (input.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else {
                System.out.println("Replace cables and try again. ");
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            input = scan.nextLine();
            if (input.equals("y")) {
                System.out.println("Replace the battery.");
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                input = scan.nextLine();
                if (input.equals("y")) {
                    System.out.println("Check spark plug connections.");
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    input = scan.nextLine();
                    if (input.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        input = scan.nextLine();
                        if (input.equals("y")) {
                            System.out.println("Get it in for service.");
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}