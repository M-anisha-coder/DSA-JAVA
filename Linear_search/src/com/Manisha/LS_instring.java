package com.Manisha;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LS_instring {
    public static void main(String[] args) {
        String name="manisha visvkrama";
        char target='v';
        boolean ans= searching_2(name,target);
        boolean ans_1= searching_2(name,target);
        System.out.println(ans);
        System.out.println(ans_1);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean searching(String str,char target){
        //check whether string is empty or not
        if (str.length() == 0){
            return false;
        }
        //check each letter from string using normal for loop
        for(int i=0;i<str.length();i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        //this line execute when character is not in string
        return false;
    }

    static boolean searching_2(String str,char target){
        //check whether string is empty or not
        if (str.length() == 0){
            return false;
        }
        //check each letter from string using foreach loop
        for(char ch:str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        //this line excute when character is not in string
        return false;
    }
}
