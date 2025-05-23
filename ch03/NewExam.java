package ch03;

public class NewExam {

	public static void main(String[] args) {
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]"+arr2[i]);
			
		}//for종료
		System.out.println("==========");
		
		arr2[0] = 10.0;
		arr2[1] = 20.0;
		arr2[1] = 20.0;
		for(int i=0;i<3;i++) {
			System.out.println("arr2["+i+"]"+arr2[i]);
		}//for종료
		System.out.println("==========");
		
		String[] arr3 = new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
		}
		System.out.println("==========");
		
		arr3[0] = "양지민";
		arr3[1] = "엠아이티";
		arr3[2] = "자바";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
		}
		
	}

}
