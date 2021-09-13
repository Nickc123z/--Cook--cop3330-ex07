/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {

        double length = 0;
        double width = 0;
        double Area = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length = scan.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        width = scan.nextDouble();

        Area = length * width;
        //Area = Area/10.764;



        System.out.println("You entered dimension of "+length+" feet by "+width+" feet ");
        System.out.println("The area is "+Area+" square feet ");
        Area = Area/10.764;
        System.out.println("The area is "+Area+" square meter ");

    }
}


