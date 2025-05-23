package ch03;

public class ArrayCreateExam {

	public static void main(String[] args) {
		int sum1 = add(new int[] {70,80,90});
		int sum2 = add(new int[] {70,80,90});
		int sum3 = add(new int[] {70,80,90});
		System.out.println("총합 : "+sum1);
		System.out.println("총합 : "+sum2);
		System.out.println("총합 : "+sum3);
	}//main 메서드 종료

	private static int add(int[] scores) {
		int sum = 0;
		for(int i= 0;i<3;i++) {
			sum += scores[i];
		}//for종료
			
		return sum;
	}//add종료

}//class종료
