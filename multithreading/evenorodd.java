package com.multithreading;

public class evenorodd {
	

	    static class EvenThread extends Thread {
	        public void run() {
	            for (int i = 1; i <= 20; i++) {
	                if (i % 2 == 0) {
	                    System.out.println("Even: " + i);
	                   }
	            }
	        }
	   }
	    
	    static class OddThread extends Thread {
	        public void run() {
	            for (int i = 1; i <= 20; i++) {
	                if (i % 2 != 0) {
	                    System.out.println("Odd: " + i);
	                }
	            }
	        }
	  }
	    
	    public static void main(String[] args) {
	        Thread evenThread = new EvenThread();
	        Thread oddThread = new OddThread();
	        
	        evenThread.start();
	        oddThread.start();
	    }
	}

