package ch05.getter.setter;

import java.util.Scanner;

public class MemberService {
	//부메뉴로 dto를 가지고 crud하는 용도
	//필드
	MemberDTO memberDTO = new MemberDTO();
	
	//생성자
	
	//메서드
	public void menu() {
//		memberDTO.name = "짐니";
//		MemberDTO.age = 27;
//		MemberDTO.admin = true;
		//앞으로 필드접근은 게터와 세터를 이욯한다
	}//menu 메서드 종료

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.print(">>");
		String name = input.next();
		
		System.out.println("나이를 입력하세요");

	}

}
