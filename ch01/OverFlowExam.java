package ch01;

public class OverFlowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x*y; //-727379968 오류 값
		System.out.println(z);
		
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1 * y1;
		System.out.println(z1);
		

	}

}
