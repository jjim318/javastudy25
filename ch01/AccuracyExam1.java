package ch01;

public class AccuracyExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		System.out.println(number*pieceUnit);
		
		int totalPieces = apple *10;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result +"조각이 남는다");
	}

}
