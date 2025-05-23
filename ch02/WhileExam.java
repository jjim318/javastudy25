package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
			
			Scanner inputInt = new Scanner(System.in);//정수용
			Scanner inputChar = new Scanner(System.in);//문자용
			boolean run = true;//무한반복용 변수
			
			while(run) {
			
				System.out.println("====엠비씨 아카데미 성적처리====");
				System.out.println("1. 교직원 관리");
				System.out.println("2. 학생관리");
				System.out.println("3. 성적관리");
				System.out.println("9. 프로그램 종료");
				System.out.print("(1~9)>>>");
			
			int selectInt = inputInt.nextInt();//숫자입력
			
			switch(selectInt) {//키보드로 입력된 숫자를 판단
			case 1 :
				System.out.println("교직원 관리 메뉴로 진입하였습다");
				boolean subRun = true;
			
			while(subRun) {//교직원 관리용 코드
				System.out.println("a. 교직원 등록");
				System.out.println("b. 교직원 보기");
				System.out.println("c. 교직원 수정");
				System.out.println("d. 교직원 삭제");
				System.out.println("z. 교직원 메뉴 종료");
				System.out.print("(a~z)>>>");
				
				char subSelect = inputChar.next().charAt(0);//위에서 받은 알파벳 처리
				
				switch(subSelect) {
					
				case 'A' :
				case 'a' :
					System.out.println("교직원등록 메뉴입니다");
					break;
				case 'B' :
				case 'b' :
					System.out.println("교직원보기 메뉴입니다");
					break;
				case 'C' :
				case 'c' :
					System.out.println("교직원수정 메뉴입니다");
					break;
				case 'D' :
				case 'd' :
					System.out.println("교직원삭제 메뉴입니다");
					break;
				case 'Z' :
				case 'z' :
					System.out.println("교직원 메뉴 종료합니다");
					
					subRun = false;
				
				default :
					System.out.println("a~z 값만 입력하세요");
					System.out.println("프로그램을 다시 실행 하세요");
					break;
				}//교직원 스위치문 종료
				
				break;
			}
			case 2 :
			System.out.println("학생관리 메뉴로 진입하였습니다");
			boolean subRun1 = true;
			
			while(subRun1) {//교직원 관리용 코드
				System.out.println("a. 학생 등록");
				System.out.println("b. 학생 보기");
				System.out.println("c. 학생 수정");
				System.out.println("d. 학생 삭제");
				System.out.println("z. 학생 메뉴 종료");
				System.out.print("(a~z)>>>");
				
				char subSelect = inputChar.next().charAt(0);//위에서 받은 알파벳 처리
				
				switch(subSelect) {
					
				case 'A' :
				case 'a' :
					System.out.println("학생등록 메뉴입니다");
					break;
				case 'B' :
				case 'b' :
					System.out.println("학생보기 메뉴입니다");
					break;
				case 'C' :
				case 'c' :
					System.out.println("학생수정 메뉴입니다");
					break;
				case 'D' :
				case 'd' :
					System.out.println("학생삭제 메뉴입니다");
					break;
				case 'Z' :
				case 'z' :
					System.out.println("학생 메뉴 종료합니다");
					
					subRun1 = false;
				
				default :
					System.out.println("a~z 값만 입력하세요");
					System.out.println("프로그램을 다시 실행 하세요");
					break;
				}
				subRun1 = false;
				break;
			}
			case 3 :
			System.out.println("성적관리 메뉴로 진입하였습니다");
			boolean subRun2 = true;
			
			while(subRun2) {
				System.out.println("a. 성적 등록");
				System.out.println("b. 성적 보기");
				System.out.println("c. 성적 수정");
				System.out.println("d. 성적 삭제");
				System.out.println("z. 성적 메뉴 종료");
				System.out.print("(a~z)>>>");
				
				char subSelect = inputChar.next().charAt(0);//위에서 받은 알파벳 처리
				
				switch(subSelect) {
					
				case 'A' :
				case 'a' :
					System.out.println("성적등록 메뉴입니다");
					break;
				case 'B' :
				case 'b' :
					System.out.println("성적보기 메뉴입니다");
					break;
				case 'C' :
				case 'c' :
					System.out.println("성적수정 메뉴입니다");
					break;
				case 'D' :
				case 'd' :
					System.out.println("성적삭제 메뉴입니다");
					break;
				case 'Z' :
				case 'z' :
					System.out.println("성적 메뉴 종료합니다");
					
					subRun2 = false;
				
				default :
					System.out.println("a~z 값만 입력하세요");
					System.out.println("프로그램을 다시 실행 하세요");
					break;
				}
				break;
			}
			case 4 :
			System.out.println("프로그램을 종료합니다");
				break;
				
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다");
				System.out.println("프로그램을 다시 실행해 주세요");
				break;
			
				}//스위치문 종료
			
			}//while문 종료
			}//main 메서드 종료
			

	}//class 종료
