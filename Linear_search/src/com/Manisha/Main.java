package com.Manisha;

public class Main {
 //main
    public static void main(String[] args) {
      int[] arr={45,48,97,-2,46,89,97,56};
      int element= 48;
      int ans=linearSearch(arr,element);
        System.out.println(ans);
    }


    //create An function
    //search an array if target found return index
    // otherwise return -1
    static int linearSearch(int[] arr, int target) {
        //check whether arr is empty or not
        if (arr.length == 0) {
            return -1;
        }
        //loop for checking target
        //check for all index of value is equal to target or not
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == target) {
                return index;
            }
        }

        //this line executed if element not found
        return -1;
    }
}
