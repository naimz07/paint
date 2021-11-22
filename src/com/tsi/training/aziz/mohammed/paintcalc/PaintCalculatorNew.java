package com.tsi.training.aziz.mohammed.paintcalc;

import java.util.*;

public class PaintCalculatorNew {

    private static final Scanner console = new Scanner(System.in);
    private static int totalSurfaceArea =0;

    public static void main(String[] args) {

        System.out.println("WELCOME TO PAINT CALCULATOR");
        System.out.println("Here we help you fin out how many tins of paint you'll need.");


        System.out.println("How many walls would you like to paint?");
        int numOfWalls = console.nextInt();
        int[] surfaceArea = new int[numOfWalls];

        for( int i = 0; i < numOfWalls; i++ )
        {
            System.out.print("Please enter the length of wall "+(i+1) +" in metres: ");
            int length = console.nextInt();
            System.out.print("Please enter the height of wall "+(i+1) +" in metres: ");
            int height = console.nextInt();
            surfaceArea[i] = length * height;
        }

        for (int i : surfaceArea)
            totalSurfaceArea += i;
        System.out.println("The total surface area is: "+totalSurfaceArea +" metres sq");



        //double totalSurfaceArea = 2 * ((length * width) + (length
        //* height) + (width * height));
        // finds the total m sq of the room taking in all the measurements of the room

        //int areaOfFloor = length * width;
        // area of just the floor

        // double totalPaintArea = totalSurfaceArea - areaOfFloor;
        //System.out.println("The total painting surface to be painted is: " + totalPaintArea);
        //this finds the area that will be painted



        System.out.println("Please enter which size paint pot you would like, 1L, 2L or 5L?");
        int paintSize;
        paintSize = console.nextInt();

        boolean correctInput = false;


        while (!correctInput) {
            switch (paintSize) {
                case 1:
                    int requiredPaint = totalSurfaceArea / 12;
                    System.out.println("You will require "
                            + Math.ceil(requiredPaint) + " 1L paint tins.");
                    correctInput = true;
                    break;

                case 2:
                    requiredPaint = totalSurfaceArea / 24;
                    //2.5 litre tins with 24 sq m
                    System.out.println("You will require "
                            + Math.ceil(requiredPaint) + " 2L paint tins.");
                    correctInput = true;
                    break;

                case 5:
                    requiredPaint = totalSurfaceArea / 60;
                    //1 litre tins with 12 m squared
                    System.out.println("You will require "
                            + Math.ceil(requiredPaint) + " 5L paint tins.");
                    correctInput = true;
                    break;
                default:
                    System.out.println("Please enter a paint pot size from 1L, 2L or 5L.");
                    paintSize = console.nextInt();
            }

        }





        /*    if (paintSize == 5)
            {
                double requiredPaint = totalPaintArea / 60;
                //5 litre tins with 60 sq ft
                System.out.println("You will require "
                        + Math.ceil(requiredPaint) + " 5L paint tins.");
                // rounds up the number of tins required
            }
            else if (paintSize == 2.5 )
            {
                double requiredPaint = totalPaintArea / 30;
                //2.5 litre tins with 30 sq ft
                System.out.println("You will require "
                        + Math.ceil(requiredPaint) + " 2.5L paint tins.");
            }
            else if (paintSize == 1)
            {
                double requiredPaint = totalPaintArea / 12;
                //1 litre tins with 12 ft squared
                System.out.println("You will require "
                        + Math.ceil(requiredPaint) + " 1L paint tins.");
            }*/

    }


}


