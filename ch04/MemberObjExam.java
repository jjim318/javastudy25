package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		//member클래스에서 호출
		
		Scanner input = new Scanner(System.in);//키보드 입력
		Member[] members = null;//변수
		
		System.out.println("가입할 회원 수를 입력하세요");
		System.out.print(">>>");
		int count = input.nextInt();
		members = new Member[count];//키보드로 입력한 숫자만큼 배열 생성
		
		System.out.println("회원가입을 시작합니다");
		boolean run = true;
		while(run) {
			
			System.out.println("1.회원가입");
			System.out.println("2.회원전체보기");
			System.out.println("3.로그인");
			System.out.println("4.회원수정");
			System.out.println("5.회원탈퇴");
			System.out.println("1~5까지만 입력하세요(다른 키를 누르면 종료합니다");
			System.out.print(">>>");
			int select = input.nextInt();
			
			Member member1 = new Member();//객체 생성
			
			switch(select) {
			
			case 1 :
				
				for(int i= 0; i<members.length;i++) {
					
					member1 = member1.memberAdd(input);//생성된 객체 회원가입용 메서드 호출 밒 실행
					members[i] = member1;
				}
				break;
			case 2 :
				Member member2 = new Member();//객체 생성
				member2.memberAllList(members);//전체보기메서드 호출 및 실행
				break;
			case 3 :
				//Member member3 = new Member();//객체 생성
				for(int i= 0; i<members.length;i++) {
					
					//member1 = member1.memberAdd(input);//생성된 객체 회원가입용 메서드 호출 밒 실행
					members[i].memberLogin(input);
				}
				//member3.memberLogin(members,input);//로그인 메서드 호출 및 실행
				break;
			case 4 :
				Member member4 = new Member();//객체 생성
				member4.memberUpdate(input);//회원수정 메서드 실행
				break;
			case 5 :
				Member member5 = new Member();//객체 생성
				member5.memberDelete(input);//회원탈퇴 메서드 실행
				break;
				
				default :
					System.out.println("회원가입 프로그램 종료");
					
					run = false;
				
			}//switch out
			
		}//while out
	}//메인 메서드 종료

}//클래스 종료
