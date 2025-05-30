package ch04.Sinfleton;

public class Singleton {
	//정적 필드
	private static Singleton st = new Singleton();
	//객체 1개만 만들어지는 싱글톤 객체 생성
	
	//생성자(싱글톤은 자신 객체를 미리 1개 만들어 놓고 정적 메서드에서 호출)
	private Singleton() {}
		
	//정적 메소드
		static Singleton getIinstance() {
			return st;
		}

}
