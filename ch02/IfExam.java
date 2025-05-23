package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("귀하의 성함을 적어주세요 >>> ");
		String name = input.next();
		
		
		System.out.println("귀하의 점수를 입력하세요 ");
		System.out.print("국어: ");
		int kor = input.nextInt();
		if(kor > 0 && kor <= 100) {
			System.out.println("다음 과목 점수를 입력하세요");
		}
		
		System.out.print("수학: ");
		int mat =input.nextInt();
		if(mat > 0 && mat <= 100); {
			System.out.println("다음 과목 점수를 입력하세요");
		}
		
		System.out.print("영어: ");
		int eng =input.nextInt();
		if(eng > 0 && eng <= 100) {
			System.out.println("평균을 확인하시겠습니까?");
		}
		
		int total = kor + mat + eng;
		double avg =(double)total/3;
		String answer = input.next();
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("==계산중입니다==");
			System.out.println("평균: "+avg);
		}else {
			System.out.println("다시 입력하세요");
		}
		
		
		if(avg > 0 && avg <=100) {
			if(avg >= 90) {
				System.out.println(name +"님이 입력하신 점수는" +avg+ "(A) 등급입니다");
				
			}else if(avg >= 80) {
				System.out.println(name +"님이 입력하신 점수는" +avg+ "(B) 등급입니다");
			}else if(avg >= 70) {
			System.out.println(name +"님이 입력하신 점수는" +avg+ "(C) 등급입니다");
			}else if(avg >= 60) {
			System.out.println(name +"님이 입력하신 점수는" +avg+ "(D) 등급입니다");
			}else {
				System.out.println(name +"님이 입력하신 점수가 낮아 (F)등급입니다.");
			}
		
		}
	}

}
