package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15;
		int num2 = 15;
		
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		
		char char1 ='F';
		char char2 = 'u';
		
		boolean result2 = (char1 <= char2);
		System.out.println(result2);
		
		int v1= 3;
		double v2=3.0;
		System.out.println(v1<v2);
		
		double v3 =1.8;
		float v4=1.8F;
		System.out.println(v3==v4);
		
		System.out.println("==========");
		System.out.println((float)v3==v4);
		System.out.println(v3==(double)v4);
		
		System.out.println("----------");
		System.out.println((int)v3*10 ==(int)v4*10);//괄호를 안 해도 10-1이랑 같음
		System.out.println(v3);
		System.out.println(v4);
		
		
		
	
	}

}
