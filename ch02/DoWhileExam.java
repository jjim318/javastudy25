package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do-while문은 1번은 실행되고 다음 번째부터 조건을 비교
		
		System.out.println("메시지를 입력하세요");
		System.out.print("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner in = new Scanner(System.in);
		String inputString;//키보드로 입력받은 값 저장용
		
		do {
			System.out.print(">>>");
			inputString = in.nextLine();//String 값을 입력받음
			System.out.println("전송값 : "+inputString);
		} while (!inputString.equals("q"));
			System.out.println("---------");
			System.out.println("프로그램 종료");
			System.out.println("---------");
		

	}//main메서드 종료

}//class 종료
