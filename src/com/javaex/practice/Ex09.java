package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
		while(true) {
			if(a == 11) {
				break;
			}
			else {
				for(int i=b; i<b+10; i++) {
					System.out.print(i + "\t");		
				}
				System.out.println("");
				a++;
				b++;
			}	
		}

	}

}
