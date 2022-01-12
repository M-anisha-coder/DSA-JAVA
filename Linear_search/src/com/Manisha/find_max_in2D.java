package com.Manisha;
import java.util.Arrays;

public class find_max_in2D {
    public static void main(String[] args) {
        int [][] matrix ={
                {23,45,86,8},
                {25,900,100,246},
                {375,756,46}
        };
        int  ans=find_max(matrix);
        //return value is maximum value
        int ans_1=find_mini(matrix);
        //return value is minimum value

        System.out.println(ans);
        System.out.println(ans_1);
    }
    static int find_max(int [][] arr){
        int max =arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
    static int find_mini(int [][] arr){
        int min =arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }
        return min;
    }
}