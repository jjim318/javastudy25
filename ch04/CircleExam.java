package ch04;

public class CircleExam {

	public static void main(String[] args) {
		// Circle 클래스를 객체로 받아서 동작하는 메서드
		
		Circle circle = new Circle();//생성자를 통해 객체를 생성
		// 객체는 circle이라는 변수와 연결
		
		circle.name = "양지민";//name 필드에 String 값을 넣는다
		circle.radius = 20;//radius 필드에 int값을 넣는다
		
		double result = circle.getArea();//circle 객체의 getArea()메서드 실행
		
		System.out.println("원의 넓이 : "+circle.radius+"는 "+result +"입니다");
		System.out.println("작성자 : "+circle.name);
		
		
	}

}
