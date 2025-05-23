package ch04;

import java.util.Scanner;

public class Member {
	//회원용 객체로 main()에서 진행함
	//클래스의 기본속성이 3가지 필요
	//필드, 생성자,메서드 ****
	
	//필드 : 객체가 가지고 있어야 할 값(변수
	//회원번호, id,pw,성명,이메일주소,집주소,전화번호
	public int mno;
	public String id;
	public String pw;
	
	//생성자 : Exam 클래스에서 main()메서드에서 new로 호출할 때 동작
	public Member() {
		//기본 생성자 : 클래스명과 같은 메서드
		//Member member = new Member();
	}
	
	//메서드 : Member클래스에서 행해지는 동작 CRUD
	public Member memberAdd(Scanner input) {//main에서 전달된 스케너 객체
		Member member = new Member();//리턴용
		
		System.out.println("회원가입용 메서드 입니다");
		System.out.println("회원번호를 입력하세요");
		System.out.print("(숫자)>>>");
		member.mno = input.nextInt();
		
		System.out.println("회원 id를 입력하세요");
		System.out.print(">>>");
		member.id = input.next();
		
		System.out.println("회원 pw를 입력하세요");
		System.out.print(">>>");
		member.pw = input.next();
		
		return member;
	
	
	
	}// memberAdd()메서드 종료
	
	public void memberAllList(Member[] members)	{
		System.out.println("모든 회원 보기 리스트 메서드 입니다");
		for(int i = 0; i<members.length; i++) {
			System.out.print("회원 번호: "+members[i].mno);
			System.out.print(" 회원 id: "+members[i].id);
			System.out.print(" 회원 pw: "+members[i].pw);
			System.out.println("----------");
			
		}
	}//memberAllList()메서드 종료
	
	public void memberLogin(Scanner input) {
		System.out.println("로그인 메서드 입니다");
		System.out.print("로그인 할 id를 입력하세요 : ");
		String idt = input.next();
		if(id.equals(idt)) {
			System.out.println("id가 입력되었습니다");
		}else {
			System.out.println("입력하신 id가 틀렸습니다");
			System.out.println("다시 한 번 입력하세요");
		}
		System.out.print("로그인 할 pw를 입력하세요 : ");
		String pwt = input.next();
		if(pw.equals(pwt)) {
			System.out.println("pw가 맞습니다");
			
		}else {
			System.out.println("로그인이 안 되었습니다");
			System.out.println("다시 한 번입력하세요");
		}
		System.out.println("회원번호를 적어주세요");
		System.out.print(">>>");
		int mnot = input.nextInt();
		if(mno==mnot) {
			System.out.println("회원번호가 맞습니다");
		}else {
			System.out.println("다시 해보세요");
		}
	}//memberAllList()메서드 종료
	
	public void memberUpdate(Scanner input) {
		System.out.println("회원수정 메서드 입니다");
		System.out.print("수정할 회원번호를 입력하세요 : ");
		int mnoUp = input.nextInt();
		
		
		
	}//memberUpdate()메서드 종료

	public void memberDelete(Scanner input) {
		System.out.println("회원탈퇴 메서드 입니다");
	}//memberDelete()메서드 종료

	
}
