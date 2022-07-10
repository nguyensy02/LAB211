/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author nguye
 */
public class Calculator {

    /**
     * Addition matrixOne and matrixTwo
     * 
     * @param matrixOne is first matrix
     * @param matrixTwo is second matrix
     * @return answer matrix
     */
    public Matrix addMatrix(Matrix matrixOne, Matrix matrixTwo) {
        System.out.println("-------------------------------------------------");
        if (matrixOne.getRow() != matrixTwo.getRow()
                || matrixOne.getCol() != matrixTwo.getCol()) {
            System.out.println("Size of matrix is not valid");
            return null;
        }
        Matrix ansMatrix = new Matrix(matrixOne.getRow(), matrixOne.getCol());
        for (int i = 0; i < matrixOne.getRow(); i++) {
            for (int j = 0; j < matrixOne.getCol(); j++) {
                int value = matrixOne.getEntry(i, j) + matrixTwo.getEntry(i, j);
                ansMatrix.setEntry(i, j, value);
            }
        }
        return ansMatrix;
    }

    /**
     * Subtraction matrixOne to matrixTwo
     * 
     * @param matrixOne is first matrix
     * @param matrixTwo is second matrix
     * @return answer matrix
     */
    public Matrix subMatrix(Matrix matrixOne, Matrix matrixTwo) {
        System.out.println("-------------------------------------------------");
        if (matrixOne.getRow() != matrixTwo.getRow()
                || matrixOne.getCol() != matrixTwo.getCol()) {
            System.out.println("Size of matrix is not valid");
            return null;
        }
        Matrix ansMatrix = new Matrix(matrixOne.getRow(), matrixOne.getCol());
        for (int i = 0; i < matrixOne.getRow(); i++) {
            for (int j = 0; j < matrixOne.getCol(); j++) {
                int value = matrixOne.getEntry(i, j) - matrixTwo.getEntry(i, j);
                ansMatrix.setEntry(i, j, value);
            }
        }
        return ansMatrix;
    }

    /**
     * Multiple matrixOne to matrixTwo
     * 
     * @param matrixOne is first matrix
     * @param matrixTwo is second matrix
     * @return answer matrix
     */
    public Matrix multiMatrix(Matrix matrixOne, Matrix matrixTwo) {
        System.out.println("-------------------------------------------------");
        if (matrixOne.getCol()!=matrixTwo.getRow()) {
            System.out.println("Col1 != Row2");
            return null;
        }
        Matrix ansMatrix = new Matrix(matrixOne.getRow(), matrixTwo.getCol());
        for (int i = 0; i < matrixOne.getRow(); i++) {
            for (int j = 0; j < matrixTwo.getCol(); j++) {
                int temp = 0;
                for (int k = 0; k < matrixOne.getCol(); k++) {
                    temp += matrixOne.getEntry(i, k)* matrixTwo.getEntry(k, j);
                }
                ansMatrix.setEntry(i, j, temp);
            }
        }
        return ansMatrix;
    }
}
