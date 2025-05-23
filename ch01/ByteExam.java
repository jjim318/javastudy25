package ch01;

public class ByteExam {

	public static void main(String[] args) {
		
		byte var1 = 125;
		int var2 =125;
		for(int i =0 ; i<5; i++) { //변수i를 0~5까지 1씩 증가하는 반복문
			var1++; //byte 125를 1씩 증가
			var2++; //int 125를 1씩 증가
			System.out.println("var1 : " +var1 + "   var2 : " + var2);
		}
		
		byte var3 = -125;
		int var4 =125;
		for(int i =0 ; i<5; i++) {
			var3--;
			var4--;
			System.out.println("var3 : " +var3 + "   var4 : " + var4);
		}
		
		byte byteValue = 10;
		int intValue = byteValue ; // 자동타입변환
		System.out.println(intValue); //10이 출력
		//byte bytevalue1 = intValue ; 큰타입에서 작은 타입은 오류
		
	}

}
