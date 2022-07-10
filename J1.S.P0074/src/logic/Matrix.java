/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Matrix {
    private int row;
    private int col;
    private int[][] matrix;
    private final Scanner SCANNER = new Scanner(System.in);

    public Matrix(int row, int col) {
        matrix = new int[row][col];
        this.row = row;
        this.col = col;
    }

    public Matrix() {
    }


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public void input(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++) {
                System.out.print("Enter matrix["+i+"]["+j+"]");
                matrix[i][j] = SCANNER.nextInt();
            }
        }
    }
            
    public void display() {
        System.out.println("Display");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public int getEntry(int i, int j) {
        return matrix[i][j];
    }
    
    public void setEntry(int i, int j, int value) {
        matrix[i][j] = value;
    }
}
