package ch02;

import java.util.Scanner;

public class While2Exam {

	public static void main(String[] args) {
		
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
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputChar = new Scanner(System.in);
		
		boolean log = true;
		
		while(log) {
			
			System.out.println("예매창으로 넘어가시겠습니까?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print(">>>");
			
			int selechtInt = inputInt.nextInt();
			
			switch(selechtInt) {
			case 1 :
				System.out.println("예매창으로 넘어갑니다");
				boolean sp = true;
				
				while(sp) {
					
					System.out.println("어떤 것을 예매하시겠습니까?");
					System.out.println("a. 야구");
					System.out.println("b. 축구");
					System.out.println("c. 농구");
					System.out.println("d. E스포츠");
					System.out.println("z. 예매를 종료합니다");
					System.out.print(">>>");
					
					char selechtChar = inputChar.next().charAt(0);
					
					switch(selechtChar) {
					
					case 'A' :
					case 'a' :
						System.out.println("야구가 예매되었습니다");
						
						break;
						
					case 'B' :
					case 'b' :
						System.out.println("축구가 예매되었습니다");
						break;
						
					case 'C' :
					case 'c' :
						System.out.println("농구가 예매되었습니다");
						break;
						
					case 'D' :
					case 'd' :
						System.out.println("E스포츠가 예매되었습니다");
						break;
						
					case 'Z' :
					case 'z' :
						System.out.println("예매가 취소되었습니다");
						
					default :
						System.out.println("a~z 값만 입력하세요");
						System.out.println("프로그램을 다시 실행 하세요");
						
						sp = false;
						System.out.println("프로그램이 종료됩니다");
					
					}//switch(selechtChar) 종료
					break;
					
					
				}//while(sp) 종료
				break;
			case 2 :
				System.out.println("프로그램이 종료됩니다");
				break;
			
			}//switch 종료
			break;
		}//while(log)문 종료
				
		
		

	}//main 메서드 종료

}//class 종료
