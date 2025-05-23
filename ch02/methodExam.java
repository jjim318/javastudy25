package ch02;

import java.util.Scanner;

public class methodExam {



	public static void main(String[] args) {
		// 메인 메서드는 주 메뉴, 사용자 지어 메서드는 부메뉴
		
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;
		String id = "hh";
		String pw = "1234";
		boolean session = false ;//로그인상태 저장용
		
	
		String list = null;
		
		
		
		while(run) {
			System.out.println("====예매====");
			System.out.println("1. 로그인");
			System.out.println("2. 예매목록");
			System.out.println("3. 예매내역");
			System.out.println("4. 관람 후 후기");
			System.out.println("9. 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();
			
			
			switch(select) {
			case 1 :
				System.out.println("로그인으로 이동합니다");
				session = LoginOK(id,pw,session);
				break;
			case 2 :
				System.out.println("예매목록으로 이동합니다");
				list = listS(list);
				break;
			case 3 :
				System.out.println("예매내역으로 이동합니다");
				details(list);
				break;
			case 4 :
				System.out.println("관람 후 후기로 이동합니다");
				break;
			case 9 :
				System.out.println("종료합니다");
				run = false;
				break;
			}
		}//while 문 종료
		

	}

	

	private static void details(String list) {
		// 예매 목록 내역
		Scanner inputDetails = new Scanner(System.in);
		
		boolean det = true;
		while(det) {
			
			System.out.println("예매 내역을 확인하시겠습니까?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print(">>>");
			
			String detail = inputDetails.next();
			
			switch(detail) {
			
			case "1" :
				System.out.println("예매 내역 확인합니다.");
				System.out.println(list + "을 예매하셨습니다");
				break;
			case "2" :
				System.out.println("다시 돌아갑니다");
				break;
			}//switch문 종료
			//return details(list);
		}//while문 종료
		
	}//예매 목록 내역 사용자 메서드 종료



	private static String listS(String list) {
		// 예매목록
		Scanner inputList = new Scanner(System.in);
		
		boolean con = true;
		
		while(con) {
			
			System.out.println("어떤 것을 예매하시겠습니까?");
			System.out.println("a. 스포츠");
			System.out.println("b. 뮤지컬");
			System.out.println("c. 콘서트");
			System.out.println("z. 예매를 종료합니다");
			System.out.print(">>>");
			
			String listVal = inputList.next();
			
			switch(listVal) {
			
			case "A" :
			case "a" :
				System.out.println("스포츠 예매되었습니다");
				list = "스포츠";
				break;
				
			case "B" :
			case "b" :
				System.out.println("뮤지컬이 예매되었습니다");
				list = "뮤지컬";
				break;
				
			case "C" :
			case "c" :
				System.out.println("콘서트가 예매되었습니다");
				list ="콘서트";
				break;
				
			case "Z" :
			case "z" :
				System.out.println("예매가 종료되었습니다");
				con = false;
				break;
			default :
				System.out.println("a~z 값만 입력하세요");
				
			
			}//스위치문 종료
			
		}//와일문 종료
		return list;//위치가 어디냐에 따라 리턴 값이 달라지기때문에 주의***
	}//예매 목록 사용자메서드 종료



	private static boolean LoginOK(String id, String pw, boolean session) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 id를 입력하세요");
		System.out.print(">>>");
		String inputId = inputLogin.next();//키보드로 id입력
		
		System.out.println("로그인 pw를 입력하세요");
		System.out.print(">>>");
		String inputPw = inputLogin.next();//키보드로 pw입력
		
		if(id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("id와 pw가 일치합니다");
			System.out.println("로그인 성공");
			session = true;
		}else {
			System.out.println("id와 pw가 불일치합니다");
			System.out.println("로그인 실패");
			session = false;
	}//id,pw 일치 판단문 종료
		return session;//로그인 성공과 실패 결과를 리턴
	}//main메서드 종료

}//class종료
