package com.videxedge;

import java.util.Scanner;

public class Main {

    public static void q1(){
        System.out.println("24 / 4 = " + (24 / 4));
        System.out.println("25 / 4 = " + (25 / 4));
        System.out.println("26 / 4 = " + (26 / 4));
        System.out.println("27 / 4 = " + (27 / 4));

        System.out.println("24 % 4 = " + (24 % 4));
        System.out.println("25 % 4 = " + (25 % 4));
        System.out.println("26 % 4 = " + (26 % 4));
        System.out.println("27 % 4 = " + (27 % 4));
    }

    public static void q2(){
        Scanner input = new Scanner(System.in);
        int books;
        System.out.println ("Enter amount of books: ");
        books = input.nextInt();
        System.out.println ("Number of shelves needed = " + books/15);
        System.out.println ("Number of books in the cart = " + books%15);
    }

    public static void q4a(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("Enter int 2 digit number: ");
        num = input.nextInt();
        System.out.println ("Sum of digits = " + (num/10+num%10));
    }

    public static void q4b(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("Enter int 3 digit number: ");
        num = input.nextInt();
        System.out.println ("Sum of digits = " + (num/100+num/10%10+num%10));
    }

    public static void q5a(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("Enter int 2 digit number: ");
        num = input.nextInt();
        System.out.println ("Opposite number+1 = " + (10*(num%10)+(num/10)+1));
    }

    public static void q5b(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("Enter int 3 digit number: ");
        num = input.nextInt();
        System.out.println ("Opposite number+1 = " + (100*(num%10)+10*(num/10%10)+(num/100)+1));
    }

    public static void main(String[] args) {
//        q1();
//        q2();
//        q4a();
//        q4b();
//        q5a();
        q5b();
    }
}
