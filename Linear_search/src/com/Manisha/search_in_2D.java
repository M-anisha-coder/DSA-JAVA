package com.Manisha;

import java.util.Arrays;

public class search_in_2D {
    public static void main(String[] args) {
        int [][] matrix ={
                {23,45,86,8},
                {25,0,100,246},
                {375,756,46}
        };
        int target =25;
        int [] ans=search_in_2D(matrix,target);  //return value is array {row,col}
        //if element is present at more than one place first index will be printed
        System.out.println(Arrays.toString(ans));
    }
    static int[] search_in_2D(int [][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
