package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.DTO.Account;
import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KnightDTO;
import ch05.lineage.service.CharacterService;
import ch05.lineage.service.LoginService;

public class LineageExam {
	
	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10];//로그인 배열
	public static Account loginAccount;//로그인 성공시 객체(세션 역화
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	static {
		knightDTO.setSword("양손검");
		knightDTO.setArmor("징박힌 갑옷");
		knightDTO.setShield("징박힌 방패");
		knightDTO.setName("기사");
		knightDTO.setSex("남");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);
		
		elfDTO.setBow("양손활");
		elfDTO.setDress("천사슈트");
		elfDTO.setArrow("크리티컬화살");
		elfDTO.setName("요정");
		elfDTO.setSex("남");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(1000000);
		
		Account account = new Account();//테스트용
		account.setId("ppp");
		account.setPw("www");
		account.setNickName("bbb");
		accounts[0] = account;//배열 0번에 계정 객체 연결
		
	}//db대신 초기값 지정(생성자 대신

	public static void main(String[] args) {
		// 객체 간의 상속을 알아본다
		//부모 객체 자식 객체에게 모든 정보를 상속함
		//자식 객체는 부모 객체의 정보를 받아 사용하며 추가적인 정볼르 생성하여 활용
		
		System.out.println("====리니지 게임을 시작합니다====");
		boolean run = true;
		while(run) {
			System.out.println("1.로그인 | 2. 캐릭터 선택 | 3. 게임 실행 | 4. 종료");
			System.out.print(">>>");
			String select = scanner.next();
			
			switch(select) {
			case "1" :
				System.out.println("로그인");
				loginAccount = LoginService.menu(scanner,accounts,loginAccount);
				break;
			case "2" :
				System.out.println("캐릭터 선택");
				CharacterService.meun(scanner,loginAccount,knightDTO,elfDTO);
				break;
			case "3" :
				System.out.println("게임 실행");
				break;
			case "4" :
				System.out.println("종료");
				run = false;
				break;
				default :
					System.out.println("1~4번만 입력해주세요");
			}//스위치문 종료
		}//와일문 종료
		
		

	}//메인메서드 종료

}//클래스종료
