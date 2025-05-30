package test;

import java.util.Scanner;

import test.DTO.DTO;

import test.service.GradeService;
import test.service.StService;

public class Test {
	static Scanner inputInt = new Scanner(System.in);
	static Scanner inputStr = new Scanner(System.in);
	
	public static DTO[] member = null;
	
	
	static {
		//main() 실행시 초기값 지정용
		member = new DTO[3];
		
		
	}

	public static void main(String[] args) {
		// 시험성적 프로그램
		
		boolean run = true;
		
		while(run) {
		System.out.println("성적처리 프로그램");
		System.out.println("=============");
		System.out.println("1. 학생관리 | 2. 성적처리 | 3.종료");
		System.out.println("=============");
		System.out.print(">>");
		String select = inputStr.next();
		
		switch(select) {
		case "1" :
			System.out.println("학생관리 페이지 입니다");
			StService stSetvice = new StService();
			StService.menu(inputInt,inputStr,member);
			break;
		case "2" :
			System.out.println("성적관리 페이지 입니다");
			GradeService gradeService = new GradeService();
			GradeService.menu(inputInt,inputStr,member);
			break;
		case "3" :
			System.out.println("종료합니다");
			run = false;
			break;
			default :
				System.out.println("1~3번만 입력해주세요");
				break;
			
		}//스위치 종료
		}//와일문 종료
	}//메인메서드 종료

}//클래스종료
