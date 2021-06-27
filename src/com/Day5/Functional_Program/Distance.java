package com.Day5.Functional_Program;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Utility utility = new Utility();
        System.out.print("Enter point x : ");
        int x = utility.getIntValue();
        System.out.print("Enter point y : ");
        int y = utility.getIntValue();
        utility.getEuclidianDist(x, y);

        //double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        //System.out.printf("Distance is %.2f", distance);

    }
}

