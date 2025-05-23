package ch01;

import java.util.Scanner;

public class StringEqualExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = in.nextLine();
		System.out.print("나이를 입력하세요 : ");
		String age = in.nextLine();
		System.out.print("E-mail을 입력하세요 : ");
		String email = new String(in.nextLine());
		
		System.out.println("====확인중====");
		System.out.println(name + "님 안녕하세요");
		System.out.println(name +"님의 나이는"+age+"입니다");
		System.out.println(name+"님의 E-mail은 "+email+"입니다");
		System.out.println("보안에 유의하시길 바랍니다");
	}

}//25.05.09

