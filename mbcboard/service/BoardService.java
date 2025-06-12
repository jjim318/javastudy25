package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dto.BoardDTO;
import mbcboard.dto.MemberDTO;

public class BoardService {
	//dao와 dto를 사용하여 부메뉴와 crud를 처리
	
	//필드
	public BoardDAO boardDAO = new BoardDAO();//1,2단계가 수행
	
	//생성자
	
	//메서드(부메뉴, 생성, 모두보기, 1개보기, 수정, 삭제)
	public void subMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		boolean subRun = true;
		while(subRun) {
			System.out.println("MBC아카데미 게시판 서비스");
			System.out.println("1. 모두보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 자세히 보기");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>>");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1" :
				System.out.println("모든 게시물 보기 메서드");
				selectAll(boardDAO);
				break;
			case "2" :
				System.out.println("게시글 작성 메서드");
				insertBoard(boardDAO, inputStr,session);
				break;
			case "3" :
				System.out.println("게시글 자세히 보기 메서드");
				readOne(inputStr);
				break;
			case "4" :
				System.out.println("게시글 수정 메서드");
				modify(inputStr,session);
				break;
			case "5" :
				System.out.println("게시글 삭제 메서드");
				deleteOne();
				break;
			case "6" :
				System.out.println("나가기");
				boardDAO.connection.close(); // 게시판 종료시 connection 종료
				subRun = false ;
				break;
				
			}//switch out
			
			
			
		}//while out
		
	}//subMenu out

	private void deleteOne() throws SQLException {
		//게시물의 번호를 받아 삭제
		System.out.println("삭제하려는 게시글의 번호를 입력");
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		int selectBno = inputInt.nextInt();
		boardDAO.deleteOne(selectBno);
		
	}

	private void modify(Scanner inputStr, MemberDTO session) throws SQLException {
		//제목을 찾아서 내용 수정
		//System.out.println("----------------------");
		
		System.out.println(session.getId()+"님의 수정하려는 게시글의 제목을 입력");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.modify(title,inputStr);
		System.out.println("======끗======");
		
	}

	private void readOne(Scanner inputStr) throws SQLException {
		//제목을 입력하면 내용이 보이도록 select처리
		System.out.println("보고싶은 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("=======끝======");
				
		
	}

	private MemberDTO insertBoard(BoardDAO boardDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		//키보드로 입력한 데이터를 dto를 사용하여 데이터베이스에 insert
		BoardDTO boardDTO = new BoardDTO();//빈객체 생성
		System.out.println("작성자 : "+session.getId());
		//boardDTO.setBwriter(inputStr.next());
		
		
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());//띄어쓰기가 있는 문장
		
		boardDAO.insertBoard(boardDTO,session);//위에서 만든 객체를 dao에게 전달
		System.out.println("=====insertBoard종료====");
		return session;
		
		
	}

	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// dao에게 전체보기 하는 서비스 제공
		System.out.println("---------------------------");
		System.out.println("========MBC게시판 목록=======");
		boardDAO.selectAll();
		System.out.println("---------------------------");
		
	}

}//class out
