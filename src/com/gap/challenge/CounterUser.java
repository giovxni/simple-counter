package com.gap.challenge;

import com.gap.challenge.params.InvalidParametersException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CounterUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Counter counter = new Counter();
        try {
            System.out.println("Insert the first parameter.");
            int param1 = scan.nextInt();

            System.out.println("Insert the second parameter.");
            int param2 = scan.nextInt();

            counter.returnNumber(param1, param2);
        } catch (InvalidParametersException e) {
            System.out.println("The first parameter should be bigger than second.");
        } catch (InputMismatchException e) {
            System.out.println("The numbers need to be integer.");
        }
    }

}
