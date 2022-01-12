package com.Manisha;
public class even_number_digit_by_stringcov {
    public static void main(String[] args) {
        int [] num ={23,56,70,-3456,578,6790,34578};
        int ans =find_number_by_string(num);
        System.out.println(ans);
    }
    static int find_number_by_string(int [] arr){
        int count =0;
        for(int i:arr){
            if (even(i)){
                count++;
            }
        }
     return count;
    }
    static boolean even( int i){
        int digit =no_of_digit(i);
        return digit%2==0;
    }
    static  int no_of_digit(int i){
        if(i<0){
            i=i*-1;
        }
        String x= String.valueOf(i);
        return x.length();
    }
}
