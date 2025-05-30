package ch05.package_test.pakage1;

public class B {
	A a; //A클래스는 B클래스와 같은 패키지이기 때문에 바로 호출가능
	
	A a1 = new A(true);//public용
	A a2 = new A(1);//default
	//A a3 = new A("문자열");//private
	//a3는 프라이빗이기 때문에 다른 클래스에서 불러올 수 없음
}
