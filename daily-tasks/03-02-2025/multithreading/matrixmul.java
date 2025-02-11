package com.multithreading;

public class matrixmul {
	    static final int N = 4;  
	    static int[][] A = new int[N][N];
	    static int[][] B = new int[N][N];
	    static int[][] C = new int[N][N];

	    static class MatrixMultiplicationThread extends Thread {
	        private int row;

	        public MatrixMultiplicationThread(int row) {
	            this.row = row;
	        }
	        public void run() {
	            for (int col = 0; col < N; col++) {
	                C[row][col] = 0;
	                for (int i = 0; i < N; i++) {
	                    C[row][col] += A[row][i] * B[i][col];
	                }
	            }
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        initializeMatrices();
	        Thread[] threads = new Thread[N];
	        
	        for (int i = 0; i < N; i++) {
	            threads[i] = new MatrixMultiplicationThread(i);
	            threads[i].start();
	        }
	        for (int i = 0; i < N; i++) {
	            threads[i].join(); 
	        }
	        System.out.println("Resultant Matrix (C) after multiplication:");
	        printMatrix(C);
	    }

	      public static void initializeMatrices() {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                A[i][j] = (int) (Math.random() * 10);  
	                B[i][j] = (int) (Math.random() * 10);  
	            }
	        }
	    }

	   
	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}


