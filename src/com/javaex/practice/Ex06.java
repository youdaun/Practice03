package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(true) {
			if(num == 101) {
				break;
			}
			else if(num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
