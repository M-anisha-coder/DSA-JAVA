package com.Manisha;

public class even_number_digit {
    public static void main(String[] args) {
        int [] num ={23,56,70,-3456,578,6790,34578};
        int ans =findNumber(num);
        System.out.println(ans);
    }
    // find number of element having even digits
    static int findNumber(int[] num){
        int count=0;
        for(int i :num){
            if (even(i)){
                count++;
            }
        }
        return count;
    }

    // element have even digit or not
    static boolean  even(int i){
        int number=number_of_digit(i);
        return number%2==0;
    }
    // count the number of digit in element
    static int  number_of_digit(int i){
        if (i<0){
            i=i*-1;
        }
        int x=0;
        while(i>0){
            x++;
            i=i/10;
        }
       return x;
    }
}
