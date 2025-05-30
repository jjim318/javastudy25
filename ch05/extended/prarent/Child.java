package ch05.extended.prarent;

public class Child extends Parent{
	
//	public void method2() {
//		System.out.println("자식의 메소드 2 호출");
//		System.out.println("Child - method2()");
	//}
	public void method3() {
		System.out.println("자식의 메소드 3 호출");
		System.out.println("Child - method3()");
	}

	@Override
	public void method2() {
		System.out.println("자식의 메소드 2 호출");
		System.out.println("Child - method2()");
		super.method2();
	}
	
	

}
