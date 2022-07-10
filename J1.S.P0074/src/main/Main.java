/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import logic.Calculator;
import logic.Matrix;
import validate.Validation;

/**
 *
 * @author nguye
 */
public class Main {

    public static void main(String[] args) {
        String messageErrorOutOfRange = "Number is out of range";
        String messageErrorInvalidNumber = "Number is invalid";
        Calculator calculator = new Calculator();
        int row1, col1, col2, choice;
        Matrix matrixOne = new Matrix();
        Matrix matrixTwo = new Matrix();
        Matrix ansMatrix;
        while (true) {
            choice = Validation.getInt("Enter your choice",
                    messageErrorOutOfRange,
                    messageErrorInvalidNumber, 1, 4);
            row1 = Validation.getInt("Enter row of matrix 1: ",
                    messageErrorOutOfRange,
                    messageErrorInvalidNumber, 1, Integer.MAX_VALUE);
            col1 = Validation.getInt("Enter col of matrix 1: ",
                    messageErrorOutOfRange,
                    messageErrorInvalidNumber, 1, Integer.MAX_VALUE);
            matrixOne.input(row1, col1);
            switch (choice) {
                case 1:
                    System.out.println("Auto get size for matrix 2");
                    matrixTwo.input(row1, col1);
                    ansMatrix = calculator.addMatrix(matrixOne, matrixTwo);
                    ansMatrix.display();
                    break;
                case 2:
                    System.out.println("Auto get size for matrix 2");
                    matrixTwo.input(row1, col1);
                    ansMatrix = calculator.subMatrix(matrixOne, matrixTwo);
                    ansMatrix.display();
                    break;
                case 3:
                    System.out.println("Auto set row for matrix 2 = col matrix 1");
                    System.out.println("Enter col for matrix 2");
                    col2 = Validation.getInt("Enter col of matrix 2: ",
                            messageErrorOutOfRange,
                            messageErrorInvalidNumber, 1, Integer.MAX_VALUE);
                    matrixTwo.input(col1, col2);
                    ansMatrix = calculator.multiMatrix(matrixOne, matrixTwo);
                    ansMatrix.display();
                    break;
                case 4:
                    return;
            }
        }
    }

}
