package com.Manisha;

public class find_mini {
    public static void main(String[] args) {
        int [] arr={23,13,79,27,0,67,24,98,8,345};
        int mini_value=mini(arr);
        System.out.println(mini_value);
    }
    //assuming array is not empty
    //return minimum value
    static int mini(int[] arr){
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
