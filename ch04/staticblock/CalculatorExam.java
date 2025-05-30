package ch04.staticblock;

public class CalculatorExam {

	public static void main(String[] args) {
		
		//calculator myCalc = new Calculator();
		double result1 = 10 * 10* Calculator.pi;
		int result2 = Calculator.plus(10, 20);
		int result3 = Calculator.minus(50, 30);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);

	}

}
