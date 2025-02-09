package com.multithreading;
import java.util.Arrays;
public class sortarray {
		    static class SortThread extends Thread {
	        int[] arr;
	        public SortThread(int[] arr) {
	            this.arr = arr;
	        }
	        public void run() {
	            Arrays.sort(arr);
	        }
	    }
	    
	    public static int[] merge(int[] left, int[] right) {
	        int[] result = new int[left.length + right.length];
	        int i = 0, j = 0, k = 0;
	        while(i < left.length && j < right.length) {
	            if(left[i] <= right[j]) {
	                result[k++] = left[i++];
	            } else {
	                result[k++] = right[j++];
	            }
	        }
	        while(i < left.length) {
	            result[k++] = left[i++];
	        }
	        while(j < right.length) {
	            result[k++] = right[j++];
	        }
	        return result;
	    }
	    
	    public static void main(String[] args) throws InterruptedException {
	        int[] array = {38, 27, 43, 3, 9, 82, 10};
	        int mid = array.length / 2;
	        int[] left = Arrays.copyOfRange(array, 0, mid);
	        int[] right = Arrays.copyOfRange(array, mid, array.length);
	        
	        SortThread t1 = new SortThread(left);
	        SortThread t2 = new SortThread(right);
	        
	        t1.start();
	        t2.start();
	        
	        t1.join();
	        t2.join();
	        
	        int[] sorted = merge(left, right);
	        System.out.println("Sorted array: " + Arrays.toString(sorted));
	    }
	}


