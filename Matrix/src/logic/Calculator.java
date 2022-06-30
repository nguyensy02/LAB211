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
     * 
     * @param matrix1
     * @param matrix2
     * @return 
     */
    public Matrix addMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getRow() != matrix2.getRow()
                || matrix1.getCol() != matrix2.getCol()) {
            System.out.println("Size of matrix is not valid");
            return null;
        }
        Matrix matrix3 = new Matrix(matrix1.getRow(), matrix1.getCol());
        for (int i = 0; i < matrix1.getRow(); i++) {
            for (int j = 0; j < matrix1.getCol(); j++) {
                int value = matrix1.getEntry(i, j) + matrix2.getEntry(i, j);
                matrix3.setEntry(i, j, value);
            }
        }
        return matrix3;
    }

    /**
     * 
     * @param matrix1
     * @param matrix2
     * @return 
     */
    public Matrix subMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getRow() != matrix2.getRow()
                || matrix1.getCol() != matrix2.getCol()) {
            System.out.println("Size of matrix is not valid");
            return null;
        }
        Matrix matrix3 = new Matrix(matrix1.getRow(), matrix1.getCol());
        for (int i = 0; i < matrix1.getRow(); i++) {
            for (int j = 0; j < matrix1.getCol(); j++) {
                int value = matrix1.getEntry(i, j) - matrix2.getEntry(i, j);
                matrix3.setEntry(i, j, value);
            }
        }
        return matrix3;
    }

    /**
     * 
     * @param matrix1
     * @param matrix2
     * @return 
     */
    public Matrix multiMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getCol()!=matrix2.getRow()) {
            System.out.println("Col1 != Row2");
            return null;
        }
        Matrix matrix3 = new Matrix(matrix1.getRow(), matrix2.getCol());
        for (int i = 0; i < matrix1.getRow(); i++) {
            for (int j = 0; j < matrix2.getCol(); j++) {
                int temp = 0;
                for (int k = 0; k < matrix1.getCol(); k++) {
                    temp += matrix1.getEntry(i, k)* matrix2.getEntry(k, j);
                }
                matrix3.setEntry(i, j, temp);
            }
        }
        return matrix3;
    }
}
