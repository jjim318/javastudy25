package ch01;

public class CharExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 75; //A문자를 출력하기 위해 char에 대입
		char c2 = 105; //10진수 65를 char에 대입하여 유니코드
		char c3 =109; //  /u라는 유니코드표에 있는 16진수 41를 출력
		
		char c4 = 75;
		char c5 = 105 ;
		
		char c6 = 87;
		char c7 = 111;
		char c8 = 110;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char han1 = '가';
		char han2 = 44032;
		char han3 = '\uac00';
				
		System.out.println(han1);
		System.out.println(han2);
		System.out.println(han3);
		
		
		
		
		
		byte byteValue = 10;
		int intValue = byteValue ; // 자동타입변환
		System.out.println(intValue); //10이 출력
		//byte bytevalue1 = intValue ; 큰타입에서 작은 타입은 오류
		
		char charValue = '가';
		intValue = charValue ;
		System.out.println("가의 유니코드 값 = " + intValue);
				

	}

}
