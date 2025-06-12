package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dao.MemberDAO;
import mbcboard.dto.BoardDTO;
import mbcboard.dto.MemberDTO;

public class MemberService {
	//dao와 dto를 사용하여 부메뉴와 crud를 처리
	//필드
	public MemberDAO memberDAO = new MemberDAO();//1,2단계 수행
	public BoardDAO boardDAO = new BoardDAO();
	public BoardDTO boardDTO = new BoardDTO();
	
	//생성자
	
	//메서드(회원가입, 로그인, 수정, 탈퇴)
	public MemberDTO subMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		boolean subRun = true;
		while(subRun) {
			System.out.println("MBC아카데미 회원 서비스");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원보기");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("6. 나가기");
			System.out.print(">>>");
			String subselect = inputStr.next();
			
			switch(subselect) {
			case "1" :
				System.out.println("회원가입 메서드");
				join(inputStr);
				break;
			case "2" :
				System.out.println("로그인 메서드");
				session = loginMember(memberDAO, inputStr,session);
				break;
			case "3" :
				System.out.println("회원보기 메서드");
				selectMBAll();
				break;
			case "4" :
				System.out.println("회원수정 메서드");
				updateUser(inputStr);
				break;
			case "5" :
				System.out.println("회원탈퇴 메서드");
				deleteMember(inputStr,session);
				break;
			case "6" :
				System.out.println("나가기");
				memberDAO.connection.close();//회원메서드종료시 connection 종료
				subRun = false;
				break;
			}//switch out
			
		}//while out
		return session;
		
	}

	private void selectMBAll() throws SQLException {
		//회원보기 메서드
		System.out.println("-------------------");
		System.out.println("====회원목록====");
		memberDAO.selectMBAll();
		System.out.println("-------------------");
		
		
	}

	private void deleteMember(Scanner inputStr, MemberDTO session) throws SQLException {
		//회원탈퇴메서드
		System.out.println("탈퇴하려는 회원의 id를 입력");
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		String id = inputStr.next();
		
		
		memberDAO.deletemember(session);
		
	}

	private void updateUser(Scanner inputStr) throws SQLException {
		//회원수정메서드
		System.out.println("수정하려는 id를 입력");
		System.out.print(">>>");
		String updateId = inputStr.next();
		
		memberDAO.updateUser(updateId,inputStr);
		System.out.println("====끗====");
		
	}

	private MemberDTO loginMember(MemberDAO memberDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		//로그인 메서드
		session = new MemberDTO();
		
		System.out.println("로그인 할 id를 입력");
		System.out.print(">>>");
		String loginId = inputStr.next();
		session.setId(loginId);
		
		System.out.println("로그인 할 pw를 입력");
		System.out.print(">>>");
		String loginPw = inputStr.next();
		session.setPw(loginPw);
		
		session = memberDAO.loginMember(session);
		return session;
		
	}

	private void join(Scanner inputStr) throws SQLException {
		//회원가입 메서드
		//키보드로 입력한 데이터를 dto를 사용하여 데이터베이스에 insert
		MemberDTO memberDTO = new MemberDTO();//빈객체 생성
		System.out.println("이름 : ");
		memberDTO.setBwriter(inputStr.next());
		
		System.out.print("id : ");
		memberDTO.setId(inputStr.next());
		
		System.out.print("pw : ");
		memberDTO.setPw(inputStr.next());
		
		
		memberDAO.join(memberDTO);//위에서 만든 객체를 dao에 전달
		System.out.println("===join종료===");
		
		
	}

}
