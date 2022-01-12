package com.Manisha;

public class linearseach_2  {
    //main
    public static void main(String[] args) {
        int[] arr={45,48,97,-2,46,89,97,56};
        int element= 0;
        int ans=linearSearch(arr,element);
        System.out.println(ans);
    }


    //create An function
    //search an array if target found return element itself
    // otherwise return max value of integer
    static int linearSearch(int[] arr, int target) {
        //check whether arr is empty or not
        if (arr.length == 0) {
            return Integer .MAX_VALUE;
        }
        //loop for checking target
        //check for all index of value is equal to target or not
        for (int index = 0; index < arr.length; index++){
            int element= arr[index];
            if (element == target) {
                return element;
            }
        }

        //this line executed if element not found
        return Integer .MAX_VALUE ;
    }
}
