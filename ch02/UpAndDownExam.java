package ch02;

import java.util.Scanner;

public class UpAndDownExam {

	public static void main(String[] args) {
		
		int answer =(int)(Math.random()*50) +1; //컴퓨터가 랜덤 1~50 숫자 생성
		Scanner input = new Scanner(System.in); //키보드로 입력받는 객체 생성
		
		int question = 0; // 사용자가 입력하는 숫자
		int hits =0;// 카운트용
		System.out.println("------------");
		System.out.println("업&다운 게임에 오신 걸 환영합니다");
		System.out.println("3번 안에 맞추면 상품을 제공합니다");
		System.out.println("상품은 관리자에게 문의 하세요");
		System.out.println("------------");
		
		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요");
			question = input.nextInt();//사용자가 숫자를 키보드로 입력
			hits ++;//키보드로 입력한 회수 카운트
			if(question>answer) {
				System.out.println("down");
			}//if종료
			else if(question<answer) {
				System.out.println("up");
			}//else if종료
		} while(question !=answer);//do종료
			System.out.println("정답입니다"+answer);
			System.out.println("고객님이 맞춘 회수는"+hits+"번입니다");
		
			if(hits<=3) {
				System.out.println("상품 수령 : 관리자가 연락을 드립니다");	
			}else {
				System.out.println("상품 수령 실패 : 다음을 노려보세요");
			}
		

	}//main 메서드 종료

}//class종료
