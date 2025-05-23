package ch01;

import java.util.Scanner;

public class NumExam {

	public static void main(String[] args) {
		// 정수 홀짝
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		int num = in.nextInt();//실행에서 괄호에 숫자 입력
		System.out.println(num%2 ==0 ? "짝수":"홓수");
		

	}

}//25.05.09