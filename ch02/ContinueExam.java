package ch02;

public class ContinueExam {

	public static void main(String[] args) {
		// for, while, do-while문에서만 사용
		//블록 내부에서 실행되면 for문의 증감식
		//또는 while문의 조건식으로 이동
		
		for(int i = 1; i <=10; i++) {
			if(i%2 !=0) {
				continue;
			}//if종료
			System.out.println(i);
		}//for종료
	}//main종료

}//class종료
