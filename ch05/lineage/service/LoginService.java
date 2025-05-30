package ch05.lineage.service;

import java.util.Scanner;

import ch05.lineage.DTO.Account;

public class LoginService {
	//로그인 부메뉴
	
	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) {
		System.out.println("1.로그인 | 2. 회원가입 | 3. 회원수정 | 4. 빠져나가기");
		System.out.print(">>>");
		String select = scanner.next();
		switch(select) {
		case "1" :
			System.out.println("로그인 시작");
			System.out.print("id : ");
			String id = scanner.next();
			
			System.out.print("pw : ");
			String pw = scanner.next();
			
			Account account = new Account();
			account.setId(id);
			account.setPw(pw);//새로만든 account 객체에 id,pw 삽입
			
			//배열에 있는 값과 비교
			for(int i = 0; i<accounts.length; i++) {
				if(accounts[i]!= null) {
					if(accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 id가 있습니다");
						if(accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("해당하는 pw가 없습니다");
						}
					}else {
						System.out.println("해당하는 id가 없습니다");
					}
				}else {
					System.out.println("해당하는 정보가 없습니다");
					break;
				}//빈객체 비교
			}//for문 종료
			break;
		case "2" :
			System.out.println("회원가입");
			System.out.print("사용하실 아이디릉 입력해주세요");
			String id1 = scanner.next();
			
			System.out.print("사용하실 비밀번호를 입력해주세요");
			String pw1 = scanner.next();
			
			break;
		case "3" :
			System.out.println("회원수정");
			break;
		case "4" :
			System.out.println("빠져나가기");
			break;
		}//스위치 종료
		return loginAccount;
	}//메뉴메서드 종료

}
