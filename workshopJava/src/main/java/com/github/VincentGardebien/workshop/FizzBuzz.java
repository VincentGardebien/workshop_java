package com.github.VincentGardebien.workshop;

public class FizzBuzz {
    public static void main(String[] args) {
        method();
        }
    public static  int x = 1;
    public static void method() {
        while (x <= 200) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print(x);
                System.out.println(" -> FizzBuzz");
            }
            else if (x % 3 == 0){
                System.out.print(x);
                System.out.println(" -> Fizz");
            }
            else if (x % 5 == 0){
                System.out.print(x);
                System.out.println(" -> Buzz");
            }
            else
                System.out.println(x);
            x = x + 1;
        }
    }
}
