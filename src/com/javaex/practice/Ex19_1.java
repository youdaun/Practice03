package com.javaex.practice;

import java.util.Scanner;

public class Ex19_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pay, money = 0;
		boolean tf = true;
		
		while(tf) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료 ");
			System.out.println("-----------------------------");
			
			System.out.print("선택>");
			int num = sc.nextInt();
			
			switch(num) {
				case 4: 
					System.out.println("프로그램 종료");
					tf = false;
					break;

				case 1:
					System.out.print("예금액>");
					pay = sc.nextInt();
					
					money = money + pay;
					break;
					
				case 2: 
					System.out.print("출금액>");
					pay = sc.nextInt();
					
					money = money - pay;
					break;
					
				case 3:
					System.out.println("잔고액>" + money);
					break;
					
				default: 
					System.out.println("다시입력해주세요");
					break;
			}
			
			
		}
		
		sc.close();
	}

}
