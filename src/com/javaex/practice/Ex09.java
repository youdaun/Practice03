package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		int a = 1;
		
		while(true) {
			if(a == 11) { // 10까지만 찍고 루프를 나가도록 해줌
				break;
			}
			else {
				for(int i=a; i<a+10; i++) { // i를 1씩 증가시키면서 출력함
					System.out.print(i + "\t");		
				}
				System.out.println("");
				a++;
			}	
		}

	}

}
