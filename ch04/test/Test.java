package ch04.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// TestClass 의 객체 생성하기
		// 기본 생성자로 객체 생성하기
		TestClass testClass01 = new TestClass();
		
		TestClass testClass02 = new TestClass("1","1","1","1");
		
		TestClass testClass03 = new TestClass("2","2");
		
		System.out.println(testClass01);	// testClass01 의 주소값
		System.out.println(testClass02);	// testClass02 의 주소값
		System.out.println(testClass03);	// testClass03 의 주소값
		System.out.println(testClass02.id);	// testClass02라는 객체의 id값
		System.out.println(testClass02.pw);	// testClass02라는 객체의 pw
		System.out.println(testClass03.id);	// testCalss03라는 객체의 id
		System.out.println(testClass03.pw);	// testClass03라는 객체의 pw
		System.out.println(testClass03.nickName);	// null
		
		
		testMethod01();
		
		int a = 10;
		int  b = testMethod02();
		System.out.println(10);
		System.out.println(testMethod02());
		System.out.println(testMethod03());
		String str = "asdfasdf";
		char ch = str.charAt(2);	// charAt(int index) 는 반환형이 char
		char ch1 = (char)testMethod02();
		
		System.out.println(exitWhile());
		
	}
	
	public static void testMethod01() {
		System.out.println("반환형 없는 메서드입니다.");
	}
	
	public static int testMethod02() {
		
		int testnum = 100;
		
		return 10000;
	}
	
	public static String testMethod03() {
		
		String testStr = "시험용 문자열";
		
		return testStr;
//		return "문자열만 반환해주면 에러는 사라집니다.";
	}
	
	public static String exitWhile() {
		
		boolean run = true;
		String test = "while문 탈출하자!";
		int testNum = 15;
		while (run) {
			if (testNum > 10) {
				return "엥? return은 반복 탈출해주는거 아냐?";
			}
			else {
				System.out.println("세상이 무너졌어ㅠㅠ");
				break;
			}
		}
		
		return test;
	}
}
