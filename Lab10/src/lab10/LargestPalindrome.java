package lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LargestPalindrome {

    public static void main(String[] args){
        int i = 0;
        int j = 0;
        List<Integer> palArray = new ArrayList<>();
        for (i = 9999; i > 999; i--){
            for (j = 9999; j > 999; j--){
                int test = i * j;
                if(isaPalindrome(Integer.toString(test))){

                    palArray.add(test);
                }
            }

        }

        Integer max = Collections.max(palArray);
        System.out.println("The largest palindrome is: " + max);
    }



    public static boolean isaPalindrome(String expr) {

        // Considering any string length 0 or 1 to be a palindrome.
        if (expr.length() == 0 || expr.length() == 1)
            return true;
        // Test first == last character, return substring if true
        if (expr.charAt(0) == expr.charAt(expr.length() - 1)) {
            return isaPalindrome(expr.substring(1, expr.length() - 1));
        }
        //
        else {
            return false;
        }
    }
}