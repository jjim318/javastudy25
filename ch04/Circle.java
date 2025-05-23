package ch04;

public class Circle {//라이브러리 클래스로 인스턴스(객체용)
	//필드(클래스에서 사용될 변수
	
	
	public String name;//Circle.name = "양지민"
	public int radius;//메인 메서드에서 Circle.radius = 10
	
	//생성자(클래스를 호출할 때 new 연산자를 사용함
	public Circle() {//생성자는 클래스명과 같은 메서드
		
	}//메인 메서드에서 Circle circle = new Circle(); 객체 생성용
	
	//메서드(동작부분
	public double getArea() {//원의 면적을 계산하는 동작
		return 3.14*radius*radius;//리턴타입이 있음
	}

}
