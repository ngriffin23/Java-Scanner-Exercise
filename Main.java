package com.kaetech;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name and favorite color");
        String name = myObj.nextLine();
        String color = myObj.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Favorite Color: " + color);

    }
}