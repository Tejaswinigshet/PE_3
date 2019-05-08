/*Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4*/

package com.stackroute;

import java.util.Scanner;

public class AdditionOfMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        System.out.println("Enter the first matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        int[][] c = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of the two matrices is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
