package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer r = k / j;

        if (j > k) {
            return k;
        } else {

            if (k % j == 0) {
                return r;
            }
            r += (k % j);

        }
        return r;
    }
}
