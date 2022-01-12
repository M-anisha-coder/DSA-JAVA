package com.Manisha;

public class LS_inrange  {
    //main
    public static void main(String[] args) {
        int[] arr={45,48,97,-2,46,89,97,56};
        int element= 89;
        int start =4;
        int end=7;
        int ans=Searchin_range(arr,element,start,end);
        System.out.println(ans);
    }


    //create An function
    //search an array if target found return element itself
    // otherwise return max value of integer
    static int Searchin_range(int[] arr, int target,int start,int end) {
        //check whether arr is empty or not
        if (arr.length == 0) {
            return -1;
        }
        //loop for checking target
        //check for all index of value is equal to target or not
        for (int index = start; index <= end; index++){
            int element= arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line executed if element not found
        return -1;
    }
}
