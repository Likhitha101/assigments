package com.multithreading;

public class sumofprimes {
	public class PrimeSumMultiThread {
	    static class PrimeSumThread extends Thread {
	        private int start, end;
	        private long sum = 0;
	        
	        public PrimeSumThread(int start, int end) {
	            this.start = start;
	            this.end = end;
	        }
	       
	        public void run() {
	            for (int i = start; i <= end; i++) {
	                if (isPrime(i)) {
	                    sum += i;
	                }
	            }
	        }
	        
	        public long getSum() {
	            return sum;
	        }
	        
	        private boolean isPrime(int n) {
	            if (n < 2) return false;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) return false;
	            }
	            return true;
	        }
	    }
	    
	    public static void main(String[] args) throws InterruptedException {
	        int limit = 100; 
	        int numberOfThreads = 4;
	        PrimeSumThread[] threads = new PrimeSumThread[numberOfThreads];
	        int range = limit / numberOfThreads;
	        int start = 1;
	        for (int i = 0; i < numberOfThreads; i++) {
	            int end = (i == numberOfThreads - 1) ? limit : start + range - 1;
	            threads[i] = new PrimeSumThread(start, end);
	            threads[i].start();
	            start = end + 1;
	        }
	        
	        long totalSum = 0;
	        for (PrimeSumThread thread : threads) {
	            thread.join();
	            totalSum += thread.getSum();
	        }
	        
	        System.out.println("Sum of all prime numbers up to " + limit + " is: " + totalSum);
	    }
	}

}
