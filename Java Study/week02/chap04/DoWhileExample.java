package sec03.exam03_dowhile;

import java.util.Scanner;  // ctrl + shift + o

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		 
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do { 
			System.out.println('>'); 
			inputString = scanner.nextLine(); 
			System.out.println(inputString);
		} while( ! inputString.equals("q")); // ; 잊지말기
		// inputString == 'q' 일 때 반복 중지
		 
		System.out.println(); 
		System.out.println("프로그램 종료");
		 
		
		
		// String inputString = scanner.nextLine(); 
		// nenxtLine(): enter 누르기 전까지의 문자열이 inputString에 저장됨 
		
		// System.out.println(inputString);
		
	}

}
