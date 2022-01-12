package com.Manisha;
import java.util.Scanner;
public class primitive {
    //primitive not further breakable
    public static void main(String[] args) {
//        int age=57;
//        String name="manisha"; //string is not primitive
//        char letter='M';    //must use single quote
//        float mark=90.7f;   // "f" to know that value is float
//        double large_deci =446.587;
//        long large_int =7239586L; //"L" to know value is large
//        boolean check= true; // first letter of true and false must be small

        // variable name are identifier and values are literals
        //if you writing millions or large value then comma's are not allowed we replace comma's by underscore.
          int s=234_000_000;
          Scanner user_in =new Scanner(System.in);
          System.out.print("enter your marks :");
          int mark= user_in.nextInt();
          System.out.println("your marks is "+ mark);

    }
}
