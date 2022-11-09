package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // surface coverage
        // number of walls
        //length and width of each wall and ceiling
        int surfaceAreaPerLiter=10;
        int totalSurfaceArea=0;
        int[][] widthAndHeightOfWall = new int[][]{
            { 10, 15},
            { 5, 4},
            { 5, 4 },
            { 3, 8 },
            { 2, 8 }
        } ;

        for (int width=0;width<5;width++){
//            for (int height=0;height<2;height++){
//                System.out.println(height+" "+width);
//
//                totalSurfaceArea=widthAndHeightOfWall[width][]
//
//            }

            totalSurfaceArea+=widthAndHeightOfWall[width][0]*widthAndHeightOfWall[width][1];
        }
    }
}
