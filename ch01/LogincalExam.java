package ch01;

import java.util.Scanner;

public class LogincalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String loginid = "hh";
		String loginpw = "1234";
		String pwcaptcha = "0000";
		Scanner input = new Scanner(System.in);
		
		System.out.print("로그인 id를 입력하세요 :"	);
		String id = input.nextLine();
		System.out.println("입력하신 id는 : " + id + "입니다");
		
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = input.nextLine();
		System.out.println("==확인 중입니다==");
		
		if( (loginid.equals(id)) & loginpw.equals(pw)) {
			
			System.out.println("id와 pw가 일치합니다");
			System.out.println("로그인이 되었습니다");
		}else {
			System.out.println("id나 pw가 다릅니다");
			System.out.println("로그인 실패");
			
		}
		
		System.out.print("보안문자를 입력하세요 :");
		String captcha = input.nextLine();
		System.out.println("==확인 중입니다==");
		
		if( (loginid.equals(id)&loginpw.equals(pw))& pwcaptcha.equals(captcha)) {
			
			System.out.println("일치합니다. 로그인이 되었습니다");
		
		}else 
			System.out.println("불일치합니다.다시 해보시길 바랍니다");
		}
	}//25.05.08




