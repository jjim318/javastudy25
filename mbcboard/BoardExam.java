package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dto.MemberDTO;
import mbcboard.service.BoardService;
import mbcboard.service.MemberService;

public class BoardExam {
	//필드
	public static Scanner inputStr = new Scanner(System.in);
	
	//생성자->static블럭
	static MemberDTO session = null;
	
	//메서드
	public static void main(String[] args) throws SQLException {
		// mbc게시판용 jdbc테스트
		//dto: 객체를 담당
		//dao : 데이터베이스에서 연동을 담당
		//service : 부메뉴와 서비스를 담당
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("MBC 자유 게시판입니다");
			System.out.println("1. 회원");
			System.out.println("2. 게시판");
			//System.out.println("3. 회원용 게시판");
			System.out.println("3. 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원용 서비스로 진입");
				MemberService memberService = new MemberService();
				session = memberService.subMenu(inputStr,session);
				break;
			case "2" :
				System.out.println("게시판 서비스로 진입");
				BoardService boardService = new BoardService();
				boardService.subMenu(inputStr,session);
				break;
//			case "3" :
//				System.out.println("회원용 게시판 서비스로 진입");
//				LoginBoard loginBoard = new LoginBoard();
//				loginBoard.subMenu(inputStr,session);
			case "3" :
				System.out.println("자유게시판 종료");
				run = false;
				break;
				default :
					System.out.println("1~3까지만 입력");
			
			}//switch out
		}//while out

	}//main() out

}//class out
