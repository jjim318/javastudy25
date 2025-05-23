package ch02;

public class BreakOutterExam {

	public static void main(String[] args) {
		// break문에 라벨을 붙이면 반복코드 종료시점을 정할 수 있다
		
		for(char upper='A'; upper <='Z'; upper++) {//A부터 Z까지 반복용 코드
			outter : for(char lower ='a'; lower <='z'; lower++ ) {//a~z까지 반복용 코드
				
				System.out.println(upper +"-"+lower);
				if(lower == 'c') {
					break outter;
				}//if문 종료
			}//for(lower)종료
			
		}//for(upper)종료

	}//main 메서드 종료

}//class종료
