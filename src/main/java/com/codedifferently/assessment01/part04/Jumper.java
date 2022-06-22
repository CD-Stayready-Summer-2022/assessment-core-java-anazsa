package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        /*
        int k - flag height
        int j - number of jumps
         */
        int long_jumps = k / j;
        int short_jumps = k % j;
        return long_jumps + short_jumps;

    }
}
