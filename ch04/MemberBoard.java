package ch04;

import java.util.Scanner;

public class MemberBoard {//회원에 대한 CRUD
	
	String id;
	String pw;
	String nickName;
	String email;
	
	
	
	//생성자 -> new로 객체 생성시 사용(생략시 기본생성자가 자동으로 만들어짐
	
	//Member member = new member();
	
	
	//메서드 -> 동작(CRUD)
	
	public Member register(Scanner input) {
		
		Member newMember = new Member();
		
		System.out.println("아이디를 입력하세요");
		newMember.id = input.next();
		
		System.out.println("암호를 입력하세요");
		newMember.pw = input.next();
		
		System.out.println("닉네임을 입력하세요");
		//newMember.nickName = input.next();
		
		System.out.println("이메일을 입력하세요");
		//newMember.email = input.next();
		
		return newMember;
	}
	
	
	
}
