package ch04.Sinfleton;

public class SingletonExam {

	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton(); 프라이빗이 붙어서 객체가 생성이 안 됨
		//Singleton obj2 = new Singleton();
		
		Singleton obj3 = Singleton.getIinstance();
		Singleton obj4 = Singleton.getIinstance();
		//싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출 할 수 없도록 막아야 한다
		//생성자를 호출한만틈 객체가 생성됙 때문
		//자신의 타입인 정적 필드를 하나 선언하고 자인의 객체를 생성해 초기화 함
		
		if(obj3 == obj4) {
			System.out.println("같은 싱글톤 객체 입니다");
		}else {
			System.out.println("다른 싱글톤 객체 입니다");
		}
		
	}

}
