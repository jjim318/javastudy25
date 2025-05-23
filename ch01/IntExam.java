package ch01;

public class IntExam {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 012;
		int var3 = 0xA;
		int var4 = 0b0010;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//long타입
		
		long var11 = 10;
		long var12 = 20L;
		long var13 = 1000000000000L; //L을 붙히지 않으면 계속 0이 이어짐. L을 붙여야 처리됨.
		
		System.out.println(var11);
		System.out.println(var12);
		System.out.println(var13);
		
		
		
		
		
		byte byteValue = 10;
		int intValue = byteValue ; // 자동타입변환
		System.out.println(intValue); //10이 출력
		//byte bytevalue1 = intValue ; 큰타입에서 작은 타입은 오류
		
		char charValue = '가';
		intValue = charValue ;
		System.out.println("가의 유니코드 값 = " + intValue);
		
		intValue = 500;
		long longValue = intValue ;
		System.out.println(longValue);
		

		
	}

}
