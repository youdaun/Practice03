package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=5; i<=num; i=i+5) {
			count = count + 1;
			sum = sum + i;
		}
		
		System.out.println("5의배수의 개수: " + count);
		System.out.println("5의배수의 합  : " + sum);
		
		sc.close();
		

	}

}
