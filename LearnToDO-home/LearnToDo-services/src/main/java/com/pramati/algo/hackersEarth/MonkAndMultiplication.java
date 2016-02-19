package com.pramati.algo.hackersEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MonkAndMultiplication {

	/**
	 * @param args
	 */
	 @SuppressWarnings("unused")
	public static void main(String args[] ) throws Exception {
	        /*
	         * Read input from stdin and provide input before running
			*/
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        int [] inpArray=new int[N];
	        Queue<Integer> integerPriorityQueue = new PriorityQueue<Integer>(N,Collections.reverseOrder());
	        for (int i = 0; i < N; i++) {
	        	integerPriorityQueue.add(Integer.parseInt(br.readLine()));
	        }	        
	        for (int i = 0; i < N; i++) {
	        	
	        	System.out.println(integerPriorityQueue.poll());
		        System.out.println("integerPriorityQueue"+ integerPriorityQueue);
	        }
	    }

}
