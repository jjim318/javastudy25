package ch01;

public class PrintfExam {

	public static void main(String[] args) {
		// 출력포멧
		
		int i = 99;
		String s = "cqx";
		double f = 3.18f;
		System.out.printf("%d\n", i);//10진법
		System.out.printf("%o\n",i);//8진법
		System.out.printf("%x\n", i);//16진법
		System.out.printf("%c\n",i);//char표
		System.out.printf("%5d\n",i);//5칸중 오른쪽 2칸
		System.out.printf("%05d\n",i);//5칸중 오른쪽 2칸 숫자 그 외 0
		System.out.printf("%s\n",s);//문자
		System.out.printf("%5s\n",s);//5칸중 문자
		System.out.printf("%-5s\n",s);//왼쪽으로 정렬된 문자
		System.out.printf("%f\n",f);//숫자
		System.out.printf("%e\n",f);//숫자
		System.out.printf("%4.1f\n",f);//4칸중 소수점 한 칸 그 외 숫자
		System.out.printf("%04.1f\n",f);//앞에 0붙히고 소수점 한 칸 그 외 숫자
		System.out.printf("%-4.1f\n",f);//왼쪽으로 정렬된 숫자

	}

}//25.05.09

