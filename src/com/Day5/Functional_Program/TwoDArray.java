package com.Day5.Functional_Program;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        int rows = 0, coloums = 0;
        Utility utility = new Utility();
        System.out.println("1. integer 2D Array");
        System.out.println("2.double 2D Array");
        System.out.println("3. boolean 2D Array");
        System.out.print("Select the type of array from above : ");
        choice = utility.getIntValue();

        if (choice > 0 && choice <= 3) {
            System.out.println("Enter the number of rows in array");
            rows = utility.getIntValue();
            System.out.print("Enter the number of columns in array: " );
            coloums = utility.getIntValue();

            Integer[][] i1 = new Integer[rows][coloums];
            Double[][] d1 = new Double[rows][coloums];
            Boolean[][] b1 = new Boolean[rows][coloums];

            switch (choice) {
                case 1:
                    Integer[][] Array = utility.getInt2DArray(rows, coloums);
                    utility.printArray(Array, rows, coloums);
                    break;


                case 2:
                    Double[][] Array1 = utility.getDouble2DArray(rows, coloums);
                    utility.printArray(Array1, rows, coloums);
                    break;
                case 3:
                    Boolean[][] Array3 = utility.getBoolean2DArray(rows, coloums);
                    utility.printArray(Array3, rows, coloums);
                    break;

                    }
                }
        else
            System.out.println("Invalid Selection");
        }
    }
