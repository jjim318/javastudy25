package ch02;

public class For2To9Exam {

	public static void main(String[] args) {
		
		for (int m = 2; m <=9; m++) {
			System.out.println("===="+m+"단====");
			for (int n =1; n<=9; n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}//for(n)종료
		}//for(m) 종료

	}

}