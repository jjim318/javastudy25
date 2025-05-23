package ch03;

import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean run = true;
		boolean session = true;

		boolean me = true;
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		MemberGrade[] grades = null;

		String[] name = { "페이커", "케리아", "클로로" };//포토카드 상품
		int[] price = { 1000, 2000, 3000 };//포토카드 가격
		int[] stock = { 5, 10, 30 };//포토카드 재고
		
		String[] list = new String[50];//구매내역 저장  최대 50개까지
		int[] listIndex = new int[]{0};//구매내역에서 저장될 위치 변수
		System.out.println("포카 자판기 입니다");
		

		while (run) {
			System.out.println("==============");
			System.out.println("1. 관리자 | 2. 사용자");
			System.out.println("0. 종료합니다");
			System.out.println("==============");
			System.out.print(">>> ");

			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("관리자 메뉴입니다 ");
				session = Menu1(me, name, price, stock, input);
				break;
			case 2:
				System.out.println("사용자 메뉴입니다");
				session = Menu2(me, name, price, stock, input,list,listIndex);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("위에 있는 번호만 눌러주세요");
				break;
			}
		}

		System.out.println("이용해주셔서 감사합니다");
	}

	
	

	private static boolean Menu1(boolean me, String[] name, int[] price, int[] stock, Scanner input) {
		// 관리자 메서드
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 이름변경");
		System.out.println("2. 가격변경");
		System.out.println("3. 상품삭제");
		System.out.println("4. 상품추가");
		System.out.println("5. 재고관리");
		System.out.println("9. 관리자 메뉴 종료");
		System.out.print(">>> ");
		int select = input.nextInt();
		input.nextLine();
		
		//boolean run = true;
		//while(run) {

		switch (select) {
		case 1:
			System.out.println("이름변경 메뉴입니다");
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i] + " 포토카드");

			}
			System.out.print("변경할 포토카드 이름을 입력하세요: ");
			String name1 = input.nextLine();

			int namech = -1;
			for (int i = 0; i < name.length; i++) {
				if (name[i].equals(name1)) {
					namech = i;
					break;
				}
			}

			if (namech != -1) {
				System.out.print("새 이름을 적어주세요: ");
				String newname = input.nextLine();
				name[namech] = newname;
				System.out.println("이름이 변경되었습니다");
			} else {
				System.out.println("해당 이름의 포토카드가 없습니다.");
			}
			break;

		case 2:
			System.out.println("가격변경 메뉴입니다");
			for (int i = 0; i < name.length; i++) {
				System.out.println(i + 1 + ". " + name[i] + " : " + price[i] + "원");
			}
			System.out.print("가격을 변경할 상품 번호를 입력하세요: ");
			int pricech = input.nextInt() - 1;
			if (pricech >= 0 && pricech < price.length) {
				System.out.print("새 가격을 입력하세요: ");
				price[pricech] = input.nextInt();
				System.out.println("가격이 변경되었습니다.");
			} else {
				System.out.println("유효하지 않은 번호입니다.");
			}
			break;

		case 3:
			System.out.println("상품삭제 메뉴입니다");
			for (int i = 0; i < name.length; i++) {
				System.out.println(i + 1 + ". " + name[i]);
				
			}
			System.out.print("삭제할 상품 번호를 입력하세요: ");
			int delete = input.nextInt() - 1;

			if (delete >= 0 && delete < name.length) {
				name[delete] = null;
				price[delete] = 0;
				stock[delete] = 0;
				System.out.println("상품이 삭제되었습니다.");
			} else {
				System.out.println("유효하지 않은 번호입니다.");
			}
			break;
			
		case 4 :
			System.out.println("상품추가 메뉴입니다");
			System.out.print("추가하실 상품의 이름을 적어주세요 : ");
			String newnm = input.nextLine();
			System.out.print("추가하실 상품의 가격을 적어주세요 : ");
			int newpc = input.nextInt();
			System.out.println("추가하실 상품의 재고를 적어주세요 : ");
			int newsk = input.nextInt();
			
//			int empty = -1;
//			for(int i=0;i<name.length;i++) {
//				if(name.equals(null)) {
//					empty = i;
//					break;
//				}
			for (int i = 0; i < name.length; i++) {
				if (name[i] == null) {
					name[i] = newnm;
					price[i] = newpc;
					stock[i] = newsk;
					
					break;
				}
			}//추가 for문종료
			
		case 5 :
			System.out.println("재고관리 메뉴입니다");
			for(int i = 0; i<stock.length;i++) {
				System.out.println(i + 1 + ". " + name[i] + " : " + stock[i] + "개");
			}
			System.out.print("재고를 변결할 상품 번호를 적어주세요 : ");
			int namesk = input.nextInt() -1;
			if (namesk >= 0 && namesk < stock.length) {
				System.out.print("변경 될 수량을 입력하세요: ");
				stock[namesk] = input.nextInt();
				System.out.println("재고가 변동되었습니다.");
			} else {
				System.out.println("유효하지 않은 번호입니다.");
			}
			break;
			
			
		case 9:
			System.out.println("관리자 메뉴를 종료합니다");
			//run = false;
			break;

		default:
			System.out.println("위에 있는 번호를 다시 확인해주세요");
		}//switch out
		//} //while out

		return me;
	}

	private static boolean Menu2(boolean me, String[] name, int[] price, int[] stock, Scanner input, String[] list, int[]listIndex) {
		// 사용자 메서드
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		MemberGrade[] grades = null;
		
		
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 회원가입");
		System.out.println("2. 포토카드 구매");
		System.out.println("3. 구매내역 보기");
		System.out.println("0. 사용자 메뉴를 종료합니다");
		System.out.print(">>>");
		int choice = input.nextInt();

		boolean run = true;
		while(run) {
		switch (choice) {
		case 1:
			
			System.out.println("몇명의 회원을 등록하시겠습니까?");
			int count  = input.nextInt();
			names = new String[count];
			ids = new String[count];
			pws = new String[count];
			grades = new MemberGrade[count];
			
			System.out.println("회원가입을 시작합니다");
			for(int i = 0; i<names.length; i++) {
				System.out.print("성함을 적어주세요 : ");
				names[i] = input.next();
				System.out.print("id를 적어주세요 : ");
				ids[i] = input.next();
				System.out.println("pw를 적어주세요 : ");
				pws[i] = input.next();
				}
			System.out.println("=====회원 등급 표=====");
			System.out.println("0");
			System.out.println(names+"님의 등급은");
			
			
			

		case 2:
			
			System.out.println("1. 포토카드 구매창입니다");
			System.out.println("구매 가능한 포토카드 목록:");

			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i] + " - 가격: " + price[i] + "원, 재고: " + stock[i]);

			}

			System.out.print("구매할 포토카드 이름을 입력해주세요 : ");
			String nub = input.next();

			for (int i = 0; i < name.length; i++) {

				if(nub.equals(name[i]) ) {
					System.out.println("구매할 포토카드 이름은 " + name[i]+"입니다");
					
					System.out.print("넣으실 금액을 입력해주세요 : ");
					int money = input.nextInt();
					System.out.print("주문하실 수량을 입력해주세요 : ");
					int quantity = input.nextInt();
					
					int total = price[i]*quantity;
					
					if (money < price[i]) {
						System.out.println("넣으신 금액이 부족합니다");

					} else {
						stock[i] -= quantity;//재고에서 수량을 뺌
						int change = money - total;
						System.out.println(name[i] + "포토카드를 구매했습니다");
						System.out.println("거스름돈 : " + change + "원입니다");
						list[listIndex[0]] = name[i]+" 가격"+price[i]+" 수량"+quantity+" 합계"+total;//구매내역으로 내려가기 위한 저장소
						listIndex[0]++;//최대값까지 불어남
						
					} // 결제후 끗
						System.out.println("더 구매를 진행하시겠습니까? Yes/No");
						System.out.print(">>>");
						String h = input.next();
						if (h.equalsIgnoreCase("Yes")) {
							System.out.println("더 구매를 진행하겠습니다");//다시 루프
						
						} else {
							System.out.println("처음으로 돌아갑니다");
							run = false;
					}

				} // 금액 넣음 끝
				
			} // for out

			break;
		case 3:
			System.out.println("구매내역 메뉴입니다");
			if(list[0] ==  null) {//위에 구매내역에 저장된게 없을 때
				System.out.println("구매한 내역이 없습니다");
			}else {
				for(int i = 0;i<listIndex[0];i++) {
					System.out.println((i+1)+". "+list[i]);
					}
			}
			run = false;
			break;
		case 0:
			System.out.println("0. 메뉴를 종료합니다");
			run = false;
			break;

		default:
			System.out.println("위에 있는 번호를 다시 확인해주세요");

		}// 스위치문 종료

		System.out.println("사용해주셔서 감사합니다");
		
		}//와일문 종료
		return me;
	}//사용자 메서드 종료
	

}//클래스 종료