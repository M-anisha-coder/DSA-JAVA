package com.Manisha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // printing string
        System.out.println("Hello World !");
        System.out.println("added in new line");

        System.out.print("hello ");
        System.out.println("not added in new line");
        //printing integer
        System.out.println(2468);
        //printing floating point
        System.out.println(356.89);
        //printing boolean
        System.out.println(true);

        //taking input
        System.out.println("enter your name : ");
        Scanner  user_input =new Scanner(System.in);
        String name= user_input.next();                  //take only one word as input
        System.out.println("enter your Age : ");
        int age =user_input.nextInt();                   //take only integer as input
        System.out.println("enter your percentage : ");
        float percentage =user_input.nextFloat();//take only float  as input
       //printing output
        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);




    }
}
