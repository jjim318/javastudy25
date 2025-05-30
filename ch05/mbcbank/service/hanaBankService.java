package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;

public class hanaBankService {
	//필드
	
	//생성자
	
	//메서드

	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank, AccountDTO[] woriBank) {
		boolean subRun = true;
		while(subRun) {
			System.out.println("------------------------");
			System.out.println("하나은행 계좌관리 메서드 입니다");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌목록");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("계좌 생성 메서드");
				createAccount(hanaBank,inputInt,inputStr);
				break;
			case "2" :
				System.out.println("계좌 목록 메서드");
				accountList(hanaBank, inputInt,inputStr);
				break;
			case "3" :
				System.out.println("입금 메서드");
				deposit(hanaBank,inputInt,inputStr);
				break;
			case "4" :
				System.out.println("출금 메서드");
				withdrawal(hanaBank,inputInt,inputStr);
				break;
			case "5" :
				System.out.println("이체 메서드");
				transfer(hanaBank,woriBank,inputInt,inputStr);
				break;
			case "6" :
				System.out.println("종료");
				System.out.println("메인으로 복귀");
				subRun = false;
				break;
				default :
					System.out.println("1~6번만 입력하세요");
					break;
			}//switch out
			
		}//while out
		
	}//부메뉴 메서드 종료

	private void transfer(AccountDTO[] hanaBank, AccountDTO[] woriBank, Scanner inputInt, Scanner inputStr) {
		// 이체 메서드
		
	}

	private void withdrawal(AccountDTO[] hanaBank, Scanner inputInt, Scanner inputStr) {
		// 출금 메서드
		System.out.println("======출금=====");
		System.out.println("계좌번호 : ");
		String ano = inputStr.next();
		
		System.out.println("출금액 : ");
		int money = inputInt.nextInt();
		
		AccountDTO inputAccount = findAccount(ano, hanaBank);
		//반복코드 배제용(배열에서 객체를 찾아주고 객체를 리턴)
		
		if(inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다");
			return;
		}
		inputAccount.setBalance(inputAccount.getBalance()-money);
		System.out.println("출금 테스트 결과 : "+inputAccount);
		//toString으로 결과보기
		System.out.println(inputAccount.getOwner()+"님 출금이 성공되었습니다");
		System.out.println("잔액 : "+inputAccount.getBalance()+"원");
		System.out.println("=====================");
	}

	private void deposit(AccountDTO[] hanaBank, Scanner inputInt, Scanner inputStr) {
		// 계좌잔액 증가
		System.out.println("======예금=====");
		System.out.println("계좌번호 : ");
		String ano = inputStr.next();
		
		System.out.println("예금액 : ");
		int money = inputInt.nextInt();
		
		AccountDTO inputAccount = findAccount(ano, hanaBank);
		//반복코드 배제용(배열에서 객체를 찾아주고 객체를 리턴)
		
		if(inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다");
			return;
		}
		inputAccount.setBalance(inputAccount.getBalance()+money);
		System.out.println("입금 테스트 결과 : "+inputAccount);
		//toString으로 결과보기
		System.out.println(inputAccount.getOwner()+"님 입금이 성공되었습니다");
		System.out.println("잔액 : "+inputAccount.getBalance()+"원");
		System.out.println("=====================");
		
	}//입금용 메서드 종료

	private AccountDTO findAccount(String ano, AccountDTO[] hanaBank) {
		// 입금 출금 이체에서 계좌번호를 이요해 객체를 찾는 반복코드 메서드
		AccountDTO account = null;
		for(int i = 0; i<hanaBank.length; i++) {
			if(hanaBank[i]!= null) {
				//하나 은행 배열이 널이 아님
				String dbAno = hanaBank[i].getAno();
				//하나은행배열에서 i를 가져와 변수를 넣음
				if(dbAno.equals(ano)) {
					//키보드로 입력된 계좌번호와 dbAno와 같은 값을 찾음
					account = hanaBank[i];
					//빈 객체에 찾은 객체를 넣음
					break;
				}//번호 같은지 판단 종료
			}//빈 객체가 아닌지 판단 종료
		}//배열 반복 종료
		return account;
	}//계좌 찾기 메서드 종료

	private void accountList(AccountDTO[] hanaBank, Scanner inputInt, Scanner inputStr) {
		// 하나은행에 계정을 모두 봄(은행원)
		System.out.println("-----하나은행 계좌 리스트-----");
		for(int i = 0; i<hanaBank.length; i++) {
			AccountDTO accountlist = hanaBank[i];
			if(accountlist != null) {
				//배열에 null이 아니면 출력
				System.out.print(accountlist.getAno());
				System.out.print("\t");
				System.out.print(accountlist.getOwner());
				System.out.print("\t");
				System.out.print(accountlist.getBalance());
				System.out.print("\t\n");
				System.out.print("----------------");
			}
		}
		
	}

	private void createAccount(AccountDTO[] hanaBank, Scanner inputInt, Scanner inputStr) {
		// 하나은행 배열에 새로운 객체를 넣음
		System.out.println("-----계좌 생성-----");
		AccountDTO myAccount = new AccountDTO();//빈객체
		System.out.print("계좌번호 : ");
		myAccount.setAno(inputStr.next());
		
		System.out.print("계좌주 : ");
		myAccount.setOwner(inputStr.next());
		
		System.out.print("초기 입금액 : ");
		myAccount.setBalance(inputInt.nextInt());//int라 21억까지 가능
		
		myAccount.setBankname("하나");//빈 객체에 데이터를 바로 넣음 은행명을 굳이 다르게 쓸필요가 없음
		
		//하나은행 배열에 객체를 삽입(null인지 확인하고 넣음
		for(int i = 0; i<hanaBank.length; i++) {
			if(hanaBank[i] == null) {
				//하나은행 배열에 null 값이 있으면 처리하는 코드
				hanaBank[i] = myAccount;//배열에 입력한 객체 연결
				System.out.println(hanaBank[i]);
				System.out.println("계좌생성이 정상적으로 처리되었습니다");
				break;//1개만 입력하기 위해 안 하면 null값에 전부 들어감
				//toString으로 테스트 결과가 보임
			}else if(i == hanaBank.length-1)  {
				System.out.println("계좌생성 되지 않았습니다 고객센터에 문의해주세요");
				//break;
			}
		}//하나은행 뱅려을 0번에서부터 반복 코드
		
	}//계좌생성 메서드 종료
}//클래스 종료
