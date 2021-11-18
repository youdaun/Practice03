package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pac = 1;
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			pac = pac * i;
		}
		
		System.out.println("결과값: " + pac);
		
		sc.close();

	}

}
