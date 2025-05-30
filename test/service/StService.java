package test.service;

import java.util.Scanner;

import test.DTO.DTO;

public class StService {

	public static void menu(Scanner inputInt, Scanner inputStr, DTO[] member) {
		// 학생관리
//		String name = "지민";
//		String id = "j";
//		String pw = "m";
		
		
		boolean subRun = true;
		while(subRun) {
			System.out.println("학생관리 메뉴");
			System.out.println("1.로그인 | 2.학생정보수정 | 3. 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("로그인 메서드");
				login(inputInt,inputStr,member);
				break;
			case "2" :
				System.out.println("학생정보수정 메서드");
				Mod(inputStr);
				break;
			case "3" :
				System.out.println("종료");
				subRun = false;
				break;
				default :
					System.out.println("1~3번만 입력해주세요");
					break;
			}//스위치 종료
			
		}//와일문 종료
		
	}//메서드 종료

	private static void Mod(Scanner inputStr) {
		// 회원수정
		
	}

	private static void login(Scanner inputInt, Scanner inputStr, DTO[] member) {
		// 로그인
		System.out.println("id를 입력하세요");
		String id = inputStr.next();
		System.out.println("입력하신 id는 " +id+"입니다");
		
		System.out.println("pw를 입력하세요");
		String pw = inputStr.next();
		System.out.println("입력하신 pw는 "+pw+"입니다");
		
		if(id.equals(id)&&pw.equals(pw)) {
			System.out.println("id와 pw가 일치합니다 로그인에 성공하셨습니다");
		}else {
			System.out.println("id나 pw가 일치하지 않습니다 다시 해보세요");
		}//if문 종료
		
	}//로그인 종료

}//클래스 종료
