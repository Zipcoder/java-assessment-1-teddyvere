package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int j, int k) {

        double totalJumps = 0;
        double counter = 2;


            if (k < j) {
                while (counter <= j) {
                counter += (k + 1);
            }
            totalJumps = Math.floor(counter / k);
        }
            if (k >= j) {
            totalJumps = 1;
        }
            if (j == 0) {
                totalJumps = 0;
            }
        return (int) totalJumps;
    }

    }
