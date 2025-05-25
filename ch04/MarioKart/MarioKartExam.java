package ch04.MarioKart;

import java.util.Scanner;

import ch04.MarioKart.dto.CartDTO;
import ch04.MarioKart.dto.CharacterDTO;
import ch04.MarioKart.dto.GliderDTO;
import ch04.MarioKart.dto.ItemDTO;
import ch04.MarioKart.dto.MemberDTO;
import ch04.MarioKart.dto.TireDTO;
import ch04.MarioKart.sv.CartService;
import ch04.MarioKart.sv.MemberService;
import ch04.MarioKart.sv.PlayService;

public class MarioKartExam {
	private static final String CharacterDTOs = null;

	// 필드
	
			public static Scanner input = new Scanner(System.in);
			
			public static MemberDTO[] memberDTOs = new MemberDTO[10];//회원배열
			public static CharacterDTO[] characterDTOs = new CharacterDTO[15];//캐릭터배열
			public static CartDTO[] cartDTOs = new CartDTO[8];//카트배열
			public static GliderDTO[] gliderDTOs = new GliderDTO[10];//글라이더배열
			public static TireDTO[] tireDTOs = new TireDTO[10];//타이어배열
			public static ItemDTO[] itemDTOs = new ItemDTO[10];//아이템배열
			
			public static MemberDTO loginState;//로그인상태유지(세션
			
			//생성자 -> static에는 필요없음(new X)
			static {
				CharacterDTO characterDTO0 = new CharacterDTO("마리오",2.0,3.5,2.3,4.7,5.8);
				CharacterDTO characterDTO1 = new CharacterDTO("루이지",1.9,2.5,3.3,5.0,4.2);
				CharacterDTO characterDTO2 = new CharacterDTO("쿠파",4.0,5.5,4.3,7.3,5.3);
				CharacterDTO characterDTO3 = new CharacterDTO("피치",1.5,2.5,2.7,1.7,3.8);
				//객체 생성완료
				
				characterDTOs[0] = characterDTO0;
				characterDTOs[1] = characterDTO1;
				characterDTOs[2] = characterDTO2;
				characterDTOs[3] = characterDTO3;
				
//				characterDTOs[0] = new MemberDTO()
			}//스택틱 블럭 -> 스태틱으로 만들 클래스의 초기값 배정
			
			static {
				ItemDTO itemDTOs0 = new ItemDTO("바나나");
				ItemDTO itemDTOs1 = new ItemDTO("등껍질");
				ItemDTO itemDTOs2 = new ItemDTO("징오징오");
				ItemDTO itemDTOs3 = new ItemDTO("폭탄병");
				ItemDTO itemDTOs4 = new ItemDTO("킬러");
				ItemDTO itemDTOs5 = new ItemDTO("부끄부끄");
				//객체 생성완료
				
				itemDTOs[0] = itemDTOs0;
				itemDTOs[1] = itemDTOs1;
				itemDTOs[2] = itemDTOs2;
				itemDTOs[3] = itemDTOs3;
				itemDTOs[4] = itemDTOs4;
				itemDTOs[5] = itemDTOs5;
				
			}//스택틱 블럭 -> 스태틱으로 만들 클래스의 초기값 배정
			//메서드
	
	

	public static void main(String[] args) {
		
		//memberDTOs[0] = new MemberDTO("1", "1", "1", "1", characterDTOs[0]);
		
		System.out.println("=====마리오 카드 ㄱㄱ=====");
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 종료");
			System.out.print(">>>");
			String select = input.next();
			
			switch(select) {
			
			case "1" :
				System.out.println("회원관리");
				MemberService  memberService = new MemberService();
				loginState = memberService.menu(input,memberDTOs,loginState);
				break;
			
			case "2" :
				System.out.println("카트관리");
				CartService cartService = new CartService();
				cartService.meun(input, characterDTOs, loginState);
				break;
			
			case "3" :
				System.out.println("게임실행");
				PlayService  playService = new PlayService();
				loginState = playService.meun(input, characterDTOs, loginState, itemDTOs, tireDTOs, cartDTOs);
				break;
			
			case "4" :
				System.out.println("게임종료");
				run = false;
				break;
				default :
					System.out.println("1~4번만 누르셈");
			
			}//스위치 종료
		}//와일종료
		
		
	}//메인메서드종료

}//클래스종료
