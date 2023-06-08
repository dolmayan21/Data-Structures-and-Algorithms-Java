package com.java.dolmayan.dsa.excercises.LeetCode;

public class CountNegatives1351 {

    public static void main(String [] args){

        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println(" TThere are " + countNegatives(grid) + " negatives number in the matrix" );

    }

    public static int countNegatives(int[][] grid) {

        int count = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                if(grid[i][j]<0){
                    count += 1;
                }
            }
        }
        return count;
    }


    
}
