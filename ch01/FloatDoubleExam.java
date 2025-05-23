package ch01;

public class FloatDoubleExam {

	public static void main(String[] args) {
		double var1 =3.14;
		float var3 = 3.14F; //F를 붙히지 않으면 계속 이어짐
		
		//정밀도 테스트
		double var4 = 0.123456789123456789;
		float var5 = 0.123456789123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		
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
		
		intValue = 200;
		double doubleValue = intValue; // int(4)를 큰 타입인 double(8)로 변환
		System.out.println(doubleValue);
		

	}

}
