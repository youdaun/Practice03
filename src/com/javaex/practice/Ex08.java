package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		for(int y=1; y<=9; y++) {
			for(int x=2; x<=9; x++) {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			}
			System.out.println("");
		}
		
	}

}
