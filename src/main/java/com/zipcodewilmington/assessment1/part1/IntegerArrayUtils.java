package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        Integer sum = 0;

        for (Integer i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];

        }



        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {


                Integer product = 1;

                for (Integer i = 0; i < intArray.length; i++) {

                    product = product * intArray[i];

                }

        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
                  Double average = 0.0;

                    for (Integer i = 0; i < intArray.length; i++) {

                        average =  average + intArray[i].doubleValue()     ;

                    }

                    average = average / (double) intArray.length;

        return average;
    }
}
