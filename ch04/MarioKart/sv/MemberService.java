package ch04.MarioKart.sv;

import java.util.Scanner;

import ch04.MarioKart.dto.MemberDTO;

public class MemberService {

	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		
		System.out.println("=====회원관리 메뉴에 진입=====");
		
		boolean run = true;
		
		while(run) {
			System.out.println("1. 가입 | 2. 로그인 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print(">>>");
			String select = input.next();//menu메서드 호출시 스캐너 객체 필수
			
			switch(select) {
			
			case "1" :
				System.out.println("계정 생성 ㄱㄱ");
				create(input,memberDTOs);
				break;
				
			case "2" :
				System.out.println("로그인 ㄱㄱ");
				loginState = login(input,memberDTOs,loginState);
				break;
				
			case "3" :
				System.out.println("계정 수정 ㄱㄱ");
				modify(input, memberDTOs, loginState);
				
				break;
				
			case "4" :
				System.out.println("계정 삭제 ㄱㄱ");
				delete(input,memberDTOs,loginState);
				break;
				
			case "5" :
				System.out.println("종료 끗");
				run = false;
				break;
				
			case "99" :
				System.out.println("관리자페이지임");
				
			default :
				System.out.println("1~5번만 누르셈");
			
				
			}//스위치 종료
		}//와일 종료
		return loginState;//멤버서비스이 리턴은 로그인 상태정보(MemberDTO)
	}//메뉴 종료

	private void delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 삭제메서드
		System.out.println("계정삭제ㄱㄱ");
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null) {
				System.out.println(i + 1 + ". " + memberDTOs[i].id);
			}
			
			
		}
		System.out.print("삭제계정 선택 ㄱㄱ ");
		int delete = input.nextInt() - 1;

		if (delete >= 0 && delete < memberDTOs.length) {
			memberDTOs[delete] = null;
			//id[delete] = 0;
			//stock[delete] = 0;
			System.out.println("계정 삭제 ㅇㅇ");
		} else {
			System.out.println("유효하지 않은 번호입니다.");
		}
		//break;
		
	}

	private void modify(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 수정메서드
		System.out.println("아디 입력 ㄱㄱ");
		System.out.print(">>>");
		String id = input.next();
		
		System.out.println("비번 입력 ㄱㄱ");
		System.out.print(">>>");
		String pw = input.next();
		
		MemberDTO modifyMEmber = new MemberDTO();
		modifyMEmber.id = id;
		modifyMEmber.pw = pw;
		
		if(loginState.id.equals(modifyMEmber.id)//키보드 아이디와 로그인 아이디 비교
				&& loginState.pw.equals(modifyMEmber.pw)) {
			System.out.println("바꿀 비번 ㄱㄱ");
			System.out.print(">>>");
			loginState.pw = input.next();
		}//if out(로그인한 사용자 정보 변경만
		
	}
	

	private MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 로그인 메서드
		
		System.out.println("아디 입력 ㄱㄱ");
		System.out.print(">>>");
		String id = input.next();
		
		System.out.println("비번 입력 ㄱㄱ");
		System.out.print(">>>");
		String pw = input.next();
		
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		
		for(int i = 0; i< memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id)&&memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공임");
				loginState = memberDTOs[i];//배열에 있는 정보가 로그인상태 객체에 삽입
			}//if out
			else {
				System.out.println("뭔가 잘못한듯? 다시 ㄱㄱ");
			}
			break;
		}//for out
		System.out.println(loginState.nickName+"로그인 성공함 ㅊㅋㅊㅋ");
		
		
		
		return loginState;//로그인 성공객체를 리턴
	}//로그인 메서드 종료

	private void create(Scanner input, MemberDTO[] memberDTOs) {
		// 회원가입메서드
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("쓸 아디 ㄱㄱ");
		System.out.print(">>>");
		memberDTO.id = input.next();
		
		System.out.println("쓸 비번 ㄱㄱ");
		System.out.print(">>>");
		memberDTO.pw = input.next();
		
		System.out.println("쓸 이멜 ㄱㄱ");
		System.out.print(">>>");
		memberDTO.email = input.next();
		
		System.out.println("쓸 닉 ㄱㄱ");
		System.out.print(">>>");
		memberDTO.nickName = input.next();
		
//		MemberDTO memberDTO = new MemberDTO();//빈 객체 생성
		
//		memberDTO.id = id;
//		memberDTO.pw = pw;
//		memberDTO.nickName = nickName;
//		memberDTO.email =  email;
		//키보드로 받은 값을 객체에 넣음
		//두가지 방법이 있음(위에 한 것처럼과 주석처럼
		
		for(int i = 0; i<memberDTOs.length; i++){
			if(memberDTOs[i] == null) {//null이면 값이 있음
				memberDTOs[i] = memberDTO;
				break;//브레이크 안 걸면 null 값이 있는 곳마다 다 값을 넣음
			}//이프 종료
		}//for종료
		
		System.out.println(memberDTO.nickName+"회원가입 ㅊㅋㅊㅋ");
		
		
		
		
	}

}
