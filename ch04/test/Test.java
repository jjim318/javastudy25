package ch04.test;

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

	}

}
