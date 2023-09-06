/*  Task 9: Matrix Operations
    Write a Java program that performs basic matrix operations:
    Matrix addition and subtraction.
    Matrix multiplication.
    Transposing a matrix. */
    
import java.util.Scanner;

public class MatrixOperations{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = sc.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = sc.nextInt();

        if(colsA != rowsB){

            System.out.println("Matrix multiplication is not possible. The number of columns in A must be equal to the number of rows in B.");
            sc.close();
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        // Input matrix A
        System.out.println("Enter elements for matrix A:");
        inputMatrix(sc, matrixA);

        // Input matrix B
        System.out.println("Enter elements for matrix B:");
        inputMatrix(sc, matrixB);

        // Perform matrix operations
        performMatrixOperations(matrixA, matrixB);

        sc.close();
    }

    public static void inputMatrix(Scanner sc, int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("Element (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void performMatrixOperations(int[][] matrixA, int[][] matrixB){
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Matrix addition
        if(rowsA == rowsB && colsA == colsB){
            System.out.println("Matrix Addition Result:");
            int[][] resultAddition = new int[rowsA][colsA];
            for(int i = 0; i < rowsA; i++){
                for(int j = 0; j < colsA; j++){

                    resultAddition[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(resultAddition[i][j] + " ");
                }
                System.out.println();
            }
        } 
        else{
            System.out.println("Matrix addition is not possible. Matrices must have the same dimensions.");
        }

        // Matrix subtraction
        if(rowsA == rowsB && colsA == colsB){

            System.out.println("Matrix Subtraction Result:");
            int[][] resultSubtraction = new int[rowsA][colsA];
            for(int i = 0; i < rowsA; i++){
                for(int j = 0; j < colsA; j++){

                    resultSubtraction[i][j] = matrixA[i][j] - matrixB[i][j];
                    System.out.print(resultSubtraction[i][j] + " ");
                }
                System.out.println();
            }
        } 
        else{
            System.out.println("Matrix subtraction is not possible. Matrices must have the same dimensions.");
        }

        // Matrix multiplication
        System.out.println("Matrix Multiplication Result:");
        int[][] resultMultiplication = new int[rowsA][colsB];
        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsB; j++){
                for(int k = 0; k < colsA; k++){
                    resultMultiplication[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(resultMultiplication[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix transposition
        System.out.println("Matrix A Transposed:");
        int[][] transposedMatrixA = transposeMatrix(matrixA);
        displayMatrix(transposedMatrixA);
    }

    public static int[][] transposeMatrix(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void displayMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}   
