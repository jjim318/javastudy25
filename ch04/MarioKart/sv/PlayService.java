package ch04.MarioKart.sv;

import java.util.Calendar;
import java.util.Scanner;

import ch04.MarioKart.dto.CartDTO;
import ch04.MarioKart.dto.CharacterDTO;
import ch04.MarioKart.dto.ItemDTO;
import ch04.MarioKart.dto.MemberDTO;
import ch04.MarioKart.dto.TireDTO;

public class PlayService {
	//게임시작 후 카트 확인 - 시작 시간 - 가속,브레이크,아이템,종료 설정할 수 있음 - 아이템을 사용하면 상대에게 맞음 - 맞은 상대는 타이어를 교체하거나 차를 변경할 수 있음 - 종료타이밍을 정해 그 시간에는 끝남
	

	private String itemDTOs0;
	private String ItemDTOs1;

	public MemberDTO meun(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginState, ItemDTO[] itemDTOs,
			TireDTO[] tireDTOs, CartDTO[] cartDTOs) {
		System.out.println("겜 ㄱ?");
		System.out.println("'"+loginState.characterDTO.name+"'" + " 고른 차 이거 맞음?");
		System.out.println("1. ㅇㅇ | 2. ㄴㄴ");
		System.out.print(">>>");
		String selet = input.next();

		switch (selet) {
		case "1":
			System.out.println("그럼 겜 시작 ㄱㄱ");
			break;

		case "2":
			System.out.println("뒤로 가서 정하셈");
			break;
		}
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 시간은 "+hour+"시"+minute+"분"+second+"초 입니다");
		System.out.println(loginState.characterDTO.name + "이(가) 주행을 시작합니다");

		boolean run = true;
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1. 엔진가속  | 2. 브레이크 ");
			System.out.println("-----------------------");
			System.out.println("3. 아이템   | 4. 종료 ");
			System.out.println("-----------------------");
			System.out.print(">>>");
			int speedInput = input.nextInt();

			switch (speedInput) {

			case 1:
				System.out.println("가속을 진행합니다.");
				loginState.characterDTO.speed += 20;
				if (loginState.characterDTO.speed >= 230) { // 현재속도가 최고속도보다 크거나 같으면!
					loginState.characterDTO.speed = 230;
				} // 230이상 출력 안됨

				System.out.println("현재 속도 : " + loginState.characterDTO.speed);

				break;
			case 2:
				System.out.println("감속을 진행합니다.");
				loginState.characterDTO.speed -= 10;
				if (loginState.characterDTO.speed <= 0) {
					loginState.characterDTO.speed = 0;
				}
				System.out.println("현재 속도 : " + loginState.characterDTO.speed);
				break;

			case 3:
				System.out.println("아이템 사용 ㄱ");
				System.out.println("1. 바나나 | 2. 등껍질 | 3. 징오징오");
				System.out.println("4. 폭탄병 | 5. 킬러 | 6. 부끄부끄");
				String item = input.next();
				
				switch(item) {
				case "1" :
					System.out.println("바나나 투척");
					System.out.println("ㅋㅋ 상대 미끌어짐~");
					break;
				case "2" :
					System.out.println("등껍질 투척");
					System.out.println("ㅋㅋ 상대 뱅글뱅글 도는 중~@@");
					break;
				case "3" :
					System.out.println("징오징오 투척");
					System.out.println("ㅋㅋ 상대 앞 안보일 걸?");
					break;
				case "4" :
					System.out.println("폭탄병 투척");
					System.out.println("ㅋㅋ 상대 한 번 굴렀데요~");
					break;
				case "5" :
					System.out.println("킬러 ㅋ");
					System.out.println("빠르게 날라가자");
					break;
				case "6" :
					System.out.println("부끄 부끄 ><");
					System.out.println("상대 아이템 훔쳐와써!");
					
					int indexNum = (int)(Math.random()*6);
					
					if(indexNum>=0 && indexNum<6) {
						System.out.println(itemDTOs[indexNum].itemName+"짜잔");
					}
					
					//System.out.println(item1);
				}
					break;
				
				
			case 4:
				System.out.println("겜 끗");
				System.out.println("현재 시간은 "+hour+"시"+minute+"분"+second+"초 입니다");
				System.out.println(loginState.characterDTO.name + "이(가) 주행을 종료합니다");
				
				run = false;
				break;
			} // 스위치문 종료
		} // while문 종료
		return loginState;
	}

	private int itemDTOs() {
		// TODO Auto-generated method stub
		return 0;
	}

}
