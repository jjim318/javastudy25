package ch04.MarioKart.sv;

import java.util.Scanner;

import ch04.MarioKart.dto.CharacterDTO;
import ch04.MarioKart.dto.MemberDTO;

public class CartService {

	public void meun(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginState) {
		// 키보드 입력 객체 캐릭터 배열 로그인한 사용자 상태
		for(int i = 0; i<characterDTOs.length; i++) {
			if(characterDTOs[i] != null) {
				System.out.println("이름 : "+characterDTOs[i].name+" 무게 : "+characterDTOs[i].weight+"\n");
				
			}//if out
		}//for out
		System.out.println("캐릭터를 선택 ㄱㄱ");
		System.out.print(">>>");
		String selectChar =input.next();
		
		for(int i = 0; i<characterDTOs.length; i++) {
			if(characterDTOs[i] != null && characterDTOs[i].name.equals(selectChar)) {
				loginState.characterDTO = characterDTOs[i];
			}//if out
		}//for out
		System.out.println(loginState.nickName + "님은 "+loginState.characterDTO.name + "선택함 ㅇㅇ");
//		return null;
		
		
	}

}
