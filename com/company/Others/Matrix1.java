package com.company.Others;


import java.util.Arrays;

public class Matrix1 {
    private double[][] array;
    private int row, colum;

    public Matrix1(double[][] array, int row, int colum) {
        this.array = array;
        this.row = row;
        this.colum = colum;
    }

    public Matrix1(double[][] array) {
        this.array = array;
        this.row = array.length;
        this.colum = array[0].length;
    }

    public Matrix1 sum(Matrix1 matrix) {
        if (matrix.row != this.row || matrix.colum != this.colum) {
            System.out.println("Не совпадают");
        }
        double[][] resultArray = new double[this.row][this.colum];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.colum; j++) {
                resultArray[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return new Matrix1(resultArray);
    }

    public Matrix1 mult(double num) {
        double[][] resultArray = new double[this.row][this.colum];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.colum; j++) {
                resultArray[i][j] = this.array[i][j] * num;
            }
        }
        return new Matrix1(resultArray);
    }


    public static void main(String[] args) {
        double[][] array1 = {{1, 1, 2}, {2, 2, 2}};
        Matrix1 matrix1 = new Matrix1(array1);
        Matrix1 matrix2 = new Matrix1(new double[][]{{3, 3, 3}, {2, 2, 2}});
        Matrix1 matrix3 = matrix1.sum(matrix2);
        System.out.println(Arrays.deepToString(matrix3.array));
        Matrix1 matrix4 = matrix1.mult(4);
        System.out.println(Arrays.deepToString(matrix1.array));
        Matrix1 matrix5 = matrix1.mult(3);
        System.out.println(Arrays.deepToString(matrix5.array));
        matrix4.print();
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.colum; j++) {
                System.out.println(this.array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
