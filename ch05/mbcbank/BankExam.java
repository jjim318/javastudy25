package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.service.hanaBankService;

public class BankExam {
	//필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] woriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;
	
	//생성자-> main메서드 초기화 값
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234","짐니",30000,"하나");
		hanaBank[0] = accountDTO0;
		AccountDTO accountDTO1 = new AccountDTO("5678","짐니",40000,"우리");
		woriBank[0] = accountDTO1;
		AccountDTO accountDTO2 = new AccountDTO("9012","짐니",50000,"농협");
		nhBank[0] = accountDTO2;
	}
	//메서드

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("하나은행 더미테스트 출력 테스트"+hanaBank[0]);
//		System.out.println("우리은행 더미테스트 출력 테스트"+woriBank[0]);
//		System.out.println("농협은행 더미테스트 출력 테스트"+nhBank[0]);

		boolean run = true;
		while(run) {
			System.out.println("============================");
			System.out.println("mbc코인시스템에 오신 것을 환영합니다");
			System.out.println("============================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행");
			System.out.println("3. 농협은행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("하나 은행으로 진입합니다");
				hanaBankService hanaBankService = new hanaBankService();
				hanaBankService.menu(inputInt,inputStr,hanaBank,woriBank);
				break;
			case "2" :
				System.out.println("우리 은행으로 진입합니다");
				break;
			case "3" :
				System.out.println("농협 은행으로 진입합니다");
				break;
			case "4" :
				System.out.println("종료합니다");
				run = false;
				break;
				default :
					System.out.println("1~4번만 입력하세요");
					break;
			}//메뉴 선택문 종료
		}//주메뉴 종료
	}//메서드 종료

}//클래스 종료
