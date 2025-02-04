package com.multithreading;

public class basicthread extends Thread {
	    public void run() {
	        System.out.println("Hello, Java!");
	    }
	    
	    public static void main(String[] args) {
	        basicthread thread = new basicthread();
	        thread.start();
	    }
	}


