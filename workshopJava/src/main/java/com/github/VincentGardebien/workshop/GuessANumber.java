package com.github.VincentGardebien.workshop;
import java.lang.Math;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        for (int i=0; i<args.length; i++) {
            if (args.length == 2) {
                min = Integer.parseInt(args[0]);
                max = Integer.parseInt(args[1]);
            }
            else {
                min = 1;
                max = 100;
            }
        }
        method(min, max);
    }
    public static int x = 0;
    public static void method(int min, int max) {

        int b = (int)(Math.random()*(max-min+1)+min);
        int v = 0;
        int nb = 0;
        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Your Guess?");
            String guess = myObj.nextLine();
            nb = Integer.parseInt(guess);
            if (nb < b) {
                System.out.println("Too low!");
                v = v + 1;
            }
            if (nb > b) {
                System.out.println("Too high");
                v = v + 1;
            }
            if (nb == b) {
                System.out.println("You win!");
                System.out.println("It took you " + v + "tries.");
                break;
            }
        }
    }

}
