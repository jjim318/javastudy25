package ch05.package_test.pakage1;

public class A {//접근 제한자를 생략하면 default 접근 제한자
	//public 기본 접근 제한자를 삭제하면 디폴드로 적용
	B b;//B클래스의 접근 제한자는 public으로 가능
	
	A a1 = new A(true);//public용
	A a2 = new A(1);//default
	A a3 = new A("문자열");//private
	
	//생성자 오버로딩
	public A(boolean b) {//공용생성자
		//new A(true)
		
	}
	A(int b){//디폴트 접근 제한자
		//new A(int)
	}
	private A(String s) {//개인적인 생성자
		//new A(String)
	}
}
