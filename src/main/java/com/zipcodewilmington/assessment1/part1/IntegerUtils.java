package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;

        for (Integer i = 0; i <= n; i++) {

          sum = sum + i;

        }



        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer prod = 1;



        for (Integer i = 1; i <= n; i++) {

            prod = prod * i;

        }

        return prod;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int ans = 0;
        String str2 = "";
        char c;

        String str = val.toString();

        for (Integer i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str2 = c + str2;

        }

        ans = Integer.parseInt(str2);

        return ans;
    }
}
