/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import logic.Calculator;
import logic.Matrix;

/**
 *
 * @author nguye
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SCANNER = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter choice:");
        int choice = Integer.parseInt(SCANNER.nextLine().trim());
        int row1, col1, col2;
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3;
        while (choice != 4) {
            System.out.println("Enter row of matrix 1: ");
            row1 = Integer.parseInt(SCANNER.nextLine().trim());
            System.out.println("Enter col of matrix 1: ");
            col1 = Integer.parseInt(SCANNER.nextLine().trim());
            switch (choice) {
                case 1:
                    matrix1.input(row1, col1);
                    System.out.println("Auto get size for matrix 2");
                    matrix2.input(row1, col1);
                    matrix3 = calculator.addMatrix(matrix1, matrix2);
                    matrix3.display();
                    break;
                case 2:
                    matrix1.input(row1, col1);
                    System.out.println("Auto get size for matrix 2");
                    matrix2.input(row1, col1);
                    matrix3 = calculator.subMatrix(matrix1, matrix2);
                    matrix3.display();
                    break;
                case 3:
                    matrix1.input(row1, col1);
                    System.out.println("Auto set row for matrix 2 = col matrix 1");
                    System.out.println("Enter col for matrix 2");
                    col2 =Integer.parseInt(SCANNER.nextLine().trim());
                    matrix2.input(col1, col2);
                    matrix3 = calculator.multiMatrix(matrix1, matrix2);
                    matrix3.display();
                    break;
                case 4:
                    break;
            }
            System.out.println("Enter choice:");
            choice = Integer.parseInt(SCANNER.nextLine().trim());
        }
    }

}
