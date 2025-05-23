package ch02;

public class WhileIfExam {

	public static void main(String[] args) throws Exception {
		// 키보드의 입력을 받아 제어하는 실행문
		
		boolean run = true;//실행 여부를 판단
		int speed = 100;//현재 속도는 100km/h
		int keyCode = 0;//키보드로 입력되는 값
		
		while (run) {
			if (keyCode != 13&& keyCode != 10) {//엔터가 아니면
				System.out.println("------------");
				System.out.println("1. 엑셀 | 2. 브레이크 | 3. 중지");
				System.out.println("------------");
				System.out.print("선택  : ");
				
			}//if(keyCode != 13&& keyCode != 10) 종료
			
			keyCode = System.in.read();
			//System.out.println(keyCode);
			
			if (keyCode == 49) {
				
				speed += 5;
				System.out.println("현재 속도 :"+speed);
				
			}//if (keyCode == 49) 종료
			else if(keyCode == 50) {
				speed -= 5;
				System.out.println("현재 속도 :"+speed);
			}//else if else if(keyCode == 50)
			else if (keyCode == 51) {
				run = false;
				System.out.println("크루즈 기능이 종료됩니다");
				System.out.println("현재 속도 :"+speed);
				System.out.println("안전운전 하세요");
			}//else if (keyCode == 51
		}//while(run)종료
		System.out.println("프로그램 종료");
	}//main메서드 종료

}//class 종료
