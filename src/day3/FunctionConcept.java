package day3;

import day2.Student;

public class FunctionConcept {


    public static void main(String[]args) {
        int a = 2;
        int b = 3;
        addition(a, b);   // addiding function addition to make code short

        //   System.out.println(c);

        int d = 5;
        int e = 50;
        int f = d + e;          // conventional  method
        System.out.println(f);

        int g = 2;
        int h = 6;
        int c = addition(g, h);  // again calliing function


    }
   /* private static void addition(int g, int h) {   // these line will execute above addition function
        int c = g + h;
        System.out.println(c);
    }
*/
    public static int addition(int x, int y){     // if we want to return the function (explanation on g and h
        int c = x +y;
        System.out.println(c);
        return c;
    }

    Student student5 = new Student(){

    }
    }
