package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1;
		boolean bb = true;
		
		System.out.println("=========================");
		System.out.println("    [숫자맞추기게임 시작]    ");
		System.out.println("=========================");
		
		while(bb) {
			System.out.print(">>");
			int a = sc.nextInt();
			
			if(a == num) {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료하시겠습니까?(y/n)");
				String yn = sc.nextLine();
				
				if( yn.equals("y")) {
				    bb = false;
				}
				else if( yn.equals("n")) {
					System.out.println("**");
				}
				
			}
			else if(a <= num) {
				System.out.println("더 높게");
			}
			else if(a >= num) {
				System.out.println("더 낮게");
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
		sc.close();

	}

}