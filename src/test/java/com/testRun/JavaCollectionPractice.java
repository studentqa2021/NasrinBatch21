package com.testRun;

public class JavaCollectionPractice {
	
	// 12,16,19 == Array, int==> count or total number(4)
	
	static int [] myArray = {12,16,19};
	
	public static void main(String[] args) {
		
		//loop
		
		//for(start =0; end point;++){==?>start =int i=0;end point = i<total number //}
		
		for(int i=0; i<myArray.length;i++) {
			
			System.out.println("My Array Value = "+myArray[i]);
		}
	}

}
