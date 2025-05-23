package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// switch는 조건 제어문이다
		//조건이 맞으면 case: 에 있는 실행문이 실행됨
		//if문은 true나 false의 조건이 2개 있지만
		//switch문은 여러개의 조건 결과를 받는다
		
		//성적 처리 프로그램을 만들어보자
		//keypoint : c(생성),r(읽기),u(수정),d(삭제)
		//교직원 :
		//학생 :
		//성적 :
		//프로그램 종료
		
		//메뉴 구현(알파벳으 ㄹ눌러서 메뉴로 진입)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("====엠비씨 아카데미====");
		System.out.println("====성적처리 프로그램====");
		System.out.println("===========================");
		System.out.println("a. 교직원 관리");
		System.out.println("b. 학생관리");
		System.out.println("c. 성적관리");
		System.out.println("z. 프로그램 종료");
		System.out.print("(a~z)>>>");
		
		char select = input.next().charAt(0);
		//system.out.println("선택한 문자 :" + select);
		
		switch(select) {
		
		case'A' :
		case'a' :
			System.out.println("교직원 관리 메뉴로 진입하였습다");
			System.out.println("1. 교직원 등록");
			System.out.println("2. 교직원 보기");
			System.out.println("3. 교직원 수정");
			System.out.println("4. 교직원 삭제");
			System.out.print("(1~4)>>>");
			int subSelect = input.nextInt();
			
			switch(subSelect) {
				
			case 1 :
				System.out.println("교직원등록 메뉴입니다");
				break;
			case 2 :
				System.out.println("교직원보기 메뉴입니다");
				break;
			case 3 :
				System.out.println("교직원수정 메뉴입니다");
				break;
			case 4 :
				System.out.println("교직원삭제 메뉴입니다");
				break;
				
			default :
				System.out.println("1~4 값만 입력하세요");
				System.out.println("프로그램을 다시 실행 하세요");
				break;
			}//교직원 스위치문 종료
			break;
			
		case 'B' :
		case 'b' :
			System.out.println("학생관리 메뉴로 진입하였습니다");
			break;
			
		case 'C' :
		case 'c' :
			System.out.println("성적관리 메뉴로 진입하였습니다");
			break;
			
		case 'Z' :
		case 'z' :
			System.out.println("프로그램을 종료합니다");
			break;
			
		default :
			System.out.println("메뉴에 없는 문자를 넣었습니다");
			System.out.println("프로그램을 다시 실행해 주세요");
			break;
			}//스위치문 종료
		}//main 메서드 종료
		

	}//class 종료


