package com.Manisha;
public class linearsearch_3 {
    //main
    public static void main(String[] args) {
        int[] arr={45,48,97,-2,46,89,97,56};
        int element= 48;
        boolean ans=linearSearch(arr,element);
        System.out.println(ans);
    }

    //create An function
    //search an array if target found return true
    // otherwise return false
    static boolean linearSearch(int[] arr, int target) {
        //check whether arr is empty or not
        if (arr.length == 0) {
            return false;
        }
        //loop for checking target
        //check for all index of value is equal to target or not
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        //this line executed if element not found
        return false ;
    }
}
