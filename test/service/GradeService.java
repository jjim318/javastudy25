package test.service;

import java.util.Scanner;

import test.DTO.DTO;
public class GradeService {

	public static void menu(Scanner inputInt, Scanner inputStr, DTO[] member) {
		// 성적관리
		boolean run = true;
		while(run) {
		System.out.println("성적처리메뉴");
		System.out.println("1. 성적입력 | 2. 성적보기 | 3. 성적수정 | 4.성적삭제 | 5.종료");
		System.out.print(">>>");
		String select = inputStr.next();
		
		switch(select) {
		case "1" :
			System.out.println("성적입력화면");
			add(inputInt,inputStr,member);
			break;
		case "2" :
			System.out.println("성적보기화면");
			gd(inputInt,inputStr,member);
			break;
		case "3" :
			System.out.println("성적수정화면");
			mod(inputInt,inputStr,member);
			break;
		case "4" :
			System.out.println("성적삭제화면");
			de(inputInt,inputStr,member);
			break;
		case "5" :
			System.out.println("종료");
			run = false;
			break;
			default :
				System.out.println("1~5번만 입력하세요");
				
		}//스위치 종료
		}//와일문종료
		
	}//메서드 조료

	private static void de(Scanner inputInt, Scanner inputStr, DTO[] member) {
		// 성적삭제
		
	}

	private static void mod(Scanner inputInt, Scanner inputStr, DTO[] member) {
		// 성적수정
			
	}

	private static void gd(Scanner inputInt, Scanner inputStr, DTO[] member) {
		// 성적보기
		System.out.println();
		
	}

	private static void add(Scanner inputInt, Scanner inputStr, DTO[] member) {
		//성적입력
		
		
	}

	
}//클래스 종료
